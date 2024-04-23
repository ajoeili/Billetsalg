package Domain_Model;

import Comparator.IdComparator;
import Domain_Model.Billet;

import java.util.ArrayList;

public class SolgteBilletter {
    private ArrayList<Billet> solgteBilletter = new ArrayList<>();

    public void tilføjSolgteBilletter(Billet billet) {
        solgteBilletter.add(billet);
    }

    public void printSolgteBilletter() {
        for (Billet billet : solgteBilletter) {
            billet.beregnPris(billet.pris);
            System.out.println(billet.toString());
        }
    }

    public String visSolgteBilletter() {
        int antalDørbilletter = 0;
        int antalForsalgsbilletter = 0;
        int antalStudiebilletter = 0;

        for (Billet billet : solgteBilletter) {
            if (billet instanceof Dørbillet) {
                antalDørbilletter++;
            }
            if (billet instanceof Forsalgsbillet) {
                antalForsalgsbilletter++;
            }
            if (billet instanceof Studiebillet) {
                antalStudiebilletter++;
            }
            if (solgteBilletter.isEmpty()) {
                return "Ingen solgte billetter.";
            }
        }
        return "ANTAL SOLGTE BILLETTER\n" +
                "Dørbilletter: " + antalDørbilletter + "\n" +
                "Forsalgsbilletter: " + antalForsalgsbilletter + "\n" +
                "Studiebilletter: " + antalStudiebilletter + "\n";

    }
        public ArrayList<String> hentAlleStudiekortId() {
            ArrayList<String> studieIds = new ArrayList<>();
            for (Billet billet : solgteBilletter) {
                if (billet instanceof Studiebillet) {
                    String id = String.valueOf(billet.getId());
                    studieIds.add(id);
                }
            }
            sorterBilletter();
            return studieIds;
        }

        public void sorterBilletter() {
            solgteBilletter.sort(new IdComparator());
        }
    }

