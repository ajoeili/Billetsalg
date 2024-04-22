package Comparator;

import java.util.Comparator;
import Domain_Model.Billet;

public class IdComparator implements Comparator <Billet>{

    @Override
    public int compare(Billet b1, Billet b2) {
        return Integer.compare(b1.getId(), b2.getId());
    }
}
