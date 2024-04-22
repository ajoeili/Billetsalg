package Domain_Model;

import Comparator.IdComparator;
import Domain_Model.Billet;

import java.util.ArrayList;

public class SolgteBilletter {
    private ArrayList<Billet> solgteBilletter = new ArrayList<>();
    private Billet billet = new Billet;

    public void tilføjSolgteBilletter() {
        solgteBilletter.add(new Billet("", 0, 0, "", ""));
    }

        public void printSolgteBilletter () {
            for (Billet billet : solgteBilletter) {
                System.out.println(toString());
            }
        }

        public int visSolgteBilletter () {
            return 0;
        }

        public int hentAlleStudiekortId () {
            for (Billet billet : solgteBilletter) {
                return billet.getId();
            } return 0;
        }

        @Override
        public String toString () {
            return billet.toString();
        }

        public void printBilletter() {
            for (Billet billet : solgteBilletter) {
                sorterBilletter();
                System.out.println(toString());
            }
        }

        public void sorterBilletter () {
            solgteBilletter.sort(new IdComparator());
        }

    }

