package Domain_Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Event {
    private String navn;
    private LocalDate dato;

    public Event(String navn, LocalDate dato) {
        this.navn = navn;
        this.dato = dato;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDate getDato() {
        return dato;
    }

    public boolean dageTilEvent() {
        LocalDateTime nu = LocalDateTime.now();
        LocalDate eventDato = dato;
        long dageTilEvent = ChronoUnit.DAYS.between(nu.toLocalDate(), eventDato);

        if (dageTilEvent > 10) {
            return true;
        } else {
            return false;
        }
    }
}


