public class Studiebillet extends Billet {

    public Studiebillet(String id, String eventNavn, String eventDato) {
        super("Studierabat", 90, id, eventNavn, eventDato);
    }

    public void printBillet() {
        super.printBillet();
    }

    @Override
    public int beregnPris() {
        if ()
    }
}
