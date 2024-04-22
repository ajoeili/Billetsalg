public class Dørbillet extends Billet {

    public Dørbillet(String id, String eventNavn, String eventDato) {
        super("Dørbillet", 150, id, eventNavn, eventDato);
    }

    public void printBillet() {
        super.printBillet();
    }
}
