package Domain_Model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Billet implements BilletInterface {

    // Billetinformation

    protected String type;
    protected int pris;
    protected int id;
    protected int rabatProcent = 15;

    LocalDate currentDate;
    Event event;

    public Billet(String type, int pris, int id, String eventNavn, String eventDato) {
        this.type = type;
        this.pris = pris;
        this.id = id;
        event = new Event(eventNavn, eventDato);
    }

    @Override
    public void printBillet() {
        System.out.println(toString());
    }

    @Override
    public int beregnPris(Billet billet) {
        return 0;
    }

    @Override
    public String toString() {
        return "*********************\n" +
                event.getNavn() + "\n" +
                "_____________________\n" +
                "Type: " + type + "\n" +
                "Pris: " + pris + "\n" +
                "Dato: " + event.getDato() + "\n" +
                "Id: " + id + "\n" +
                "_____________________\n";
    }

    public int getId() {
        return id;
    }

    public boolean erEventMindreEndTiDage(String eventDatoString) {

        LocalDate eventDato = LocalDate.parse(eventDatoString, DateTimeFormatter.ISO_LOCAL_DATE);

        ZonedDateTime tidszone = ZonedDateTime.now(ZoneId.of("+1"));
        LocalDate dagensDato = tidszone.toLocalDate();

        int hvorMangeDageTilEvent = dagensDato.until(eventDato).getDays();

        if (hvorMangeDageTilEvent > 10) {
            return true;
        }
        return false;
    }

}
