package Domain_Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Billet implements BilletInterface {

    protected String type;
    protected int pris;
    protected int id;
    protected int rabatProcent = 15;

    LocalDate eventDato;
    Event event;

    public Billet(String type, int pris, int id, String eventNavn, String eventDatoStr) {
        LocalDate eventDato = LocalDate.parse(eventDatoStr);
        event = new Event(eventNavn, eventDato);
        this.type = type;
        this.pris = beregnPris(pris);
        this.id = id;
    }

    @Override
    public void printBillet() {
        System.out.println(this);
    }

    @Override
    public int beregnPris(int pris) {
        try {
            if (event.dageTilEvent()) {
                int rabatPris = pris * rabatProcent / 100;
                pris -= rabatPris;
            }
        } catch (NullPointerException e) {
            return 0;
        }
        return pris;
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

}
