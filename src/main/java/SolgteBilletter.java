import java.util.ArrayList;

public class SolgteBilletter {
    private ArrayList<Billet> solgteBilletter = new ArrayList<>();

    public void tilføjSolgteBilletter() {
        solgteBilletter.add(new Billet("", 0, "", "", ""));


    public void printSolgteBilletter() {
        for (Billet billet : solgteBilletter) {
            System.out.println(toString());
        }
    }

    public int visSolgteBilletter() {
        return solgteBilletter;
    }

    public String hentAlleStudiekortId() {
        return null;
    }

    @Override
    public String toString() {

    }

    public void sorterBilletter() {
        
        }

}
