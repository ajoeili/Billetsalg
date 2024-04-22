package Domain_Model;

import Domain_Model.Billet;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Studiebillet extends Billet {

    public Studiebillet(int id, String eventNavn, String eventDato) {
        super("Studierabat", 90, id, eventNavn, eventDato);
    }

    public void printBillet() {
        super.printBillet();
    }

    @Override
    public int beregnPris(Billet billet) {
        if (billet instanceof Studiebillet)
            if(erEventMindreEndTiDage(billet.event.getDato())) {
                billet.pris = billet.RABATPROCENT;
                return pris;
            }
        return pris;
    }

}
