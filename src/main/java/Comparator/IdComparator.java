package Comparator;

import java.util.Comparator;
import Billet;


public class IdComparator implements Comparator {

    @Override
    public int compare(Billet b1, Billet b2) {
        return b1.getId().compareTo(b2.getId());
    }
}
