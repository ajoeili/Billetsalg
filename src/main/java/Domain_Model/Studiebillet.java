package Domain_Model;

import Domain_Model.Billet;

public class Studiebillet extends Billet {

    public Studiebillet(int id, String eventNavn, String eventDato) {
        super("Studierabat", 90, id, eventNavn, eventDato);
    }

    public void printBillet() {
        super.printBillet();
    }

    @Override
    public int beregnPris() {
        return 0;
    }
}
