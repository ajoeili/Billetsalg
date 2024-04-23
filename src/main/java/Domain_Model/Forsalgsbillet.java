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
            if(erEventMindreEndTiDage(event.getDato())) {
                pris = (pris/rabatProcent) * 100;;
                return pris;
            }
        return pris;
    }

}
