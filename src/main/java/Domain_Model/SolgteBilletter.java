package Domain_Model;

import Comparator.IdComparator;
import Domain_Model.Billet;

import java.util.ArrayList;

public class SolgteBilletter {
    private ArrayList<Billet> solgteBilletter = new ArrayList<>();

    public void tilføjSolgteBilletter(Billet billet) {
        solgteBilletter.add(billet);
    }

        public void printSolgteBilletter () {
            for (Billet billet : solgteBilletter) {
                System.out.println(billet.toString());
            }
        }

        public int visSolgteBilletter () {
            return 0;
        }

        public String hentAlleStudiekortId () {

            for (Billet billet : solgteBilletter) {
                if (billet instanceof Studiebillet) {
                    sorterBilletter();
                    String id = String.valueOf(billet.getId());
                    return id;
                }
            } return null;
        }

        public void sorterBilletter () {
            solgteBilletter.sort(new IdComparator());
        }

    }

