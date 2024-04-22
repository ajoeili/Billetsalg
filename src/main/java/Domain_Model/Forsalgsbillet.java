package Domain_Model;

import Domain_Model.Billet;

public class Forsalgsbillet extends Billet {

    public Forsalgsbillet(int id, String eventNavn, String eventDato) {
        super("Forsalg", 120, id, eventNavn, eventDato);
    }

    public void printBillet() {
        super.printBillet();
    }

}
