public class Event {
    private String navn;
    private String dato;

    public Event(String navn, String dato) {
        this.navn = navn;
        this.dato = dato;
    }

    public String getNavn() {
        return navn;
    }

    public String getDato() {
        return dato;
    }
}

