public class Billet implements BilletInterface {

    // Billetinformation

    private String type;
    private int pris;
    private String id;
    public static final double RABATPROCENT = 0.15;
    Event event;

    public Billet(String type, int pris, String id, String eventNavn, String eventDato) {
        this.type = type;
        this.pris = pris;
        this.id = id;
        event = new Event(eventNavn, eventDato);
    }

    public void printBillet() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "*********************\n" +
                event.getNavn() + "\n" +
                "_____________________\n" +
                "Type: " + type + "\n" +
                "Pris: " + pris + "\n" +
                "Dato: " + event.getDato() + "\n" +
                "Id: " + id + "\n" +
                "_____________________\n";
    }

    public int beregnPris() {
        return 0;
    }

    public String getId() {
        return id;
    }
}
