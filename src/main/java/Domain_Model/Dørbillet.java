package Domain_Model;

import Domain_Model.Billet;

public class Dørbillet extends Billet {

    public Dørbillet(int id, String eventNavn, String eventDato) {
        super("Dørbillet", 150, id, eventNavn, eventDato);
    }

    public void printBillet() {
        super.printBillet();
    }
}
