package Domain_Model;

import Domain_Model.Billet;

public class Forsalgsbillet extends Billet {

    public Forsalgsbillet(int id, String eventNavn, String eventDato) {
        super("Forsalg", 120, id, eventNavn, eventDato);
    }

    public void printBillet() {
        super.printBillet();
    }

    @Override
    public int beregnPris(Billet billet) {
        if (billet instanceof Forsalgsbillet)
            if(erEventMindreEndTiDage(billet.event.getDato())) {
                billet.pris = billet.RABATPROCENT;
                return pris;
            }
        return pris;
    }

}
