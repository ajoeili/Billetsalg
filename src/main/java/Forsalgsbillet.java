public class Forsalgsbillet extends Billet {

    public Forsalgsbillet(String id, String eventNavn, String eventDato) {
        super("Forsalg", 120, id, eventNavn, eventDato);
    }

    public void printBillet() {
        super.printBillet();
    }

}
