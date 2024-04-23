package Domain_Model;

public class Main {

    public static void main(String[] args) {
        Studiebillet studiebillet1 = new Studiebillet(12432, "COMEDY: MONIR MOOGHEN", "2024-12-03");
        Studiebillet studiebillet2 = new Studiebillet(87236, "COMEDY: MONIR MOOGHEN", "2024-12-03");
        Studiebillet studiebillet3 = new Studiebillet(49812, "COMEDY: MONIR MOOGHEN", "2024-12-03");
        Studiebillet studiebillet4 = new Studiebillet(67261, "COMEDY: MONIR MOOGHEN", "2024-12-03");

        Dørbillet dørbillet = new Dørbillet(83721, "COMEDY: MONIR MOOGHEN", "2024-12-03");

        Forsalgsbillet forsalgsbillet = new Forsalgsbillet(87291, "COMEDY: MONIR MOOGHEN", "2024-04-30");

        SolgteBilletter solgteBilletter = new SolgteBilletter();

        solgteBilletter.tilføjSolgteBilletter(studiebillet1);
        solgteBilletter.tilføjSolgteBilletter(studiebillet2);
        solgteBilletter.tilføjSolgteBilletter(studiebillet3);
        solgteBilletter.tilføjSolgteBilletter(studiebillet4);
        solgteBilletter.tilføjSolgteBilletter(dørbillet);
        solgteBilletter.tilføjSolgteBilletter(forsalgsbillet);

        System.out.println(solgteBilletter.hentAlleStudiekortId());
        System.out.println(solgteBilletter.visSolgteBilletter());

        solgteBilletter.printSolgteBilletter();

    }
}
