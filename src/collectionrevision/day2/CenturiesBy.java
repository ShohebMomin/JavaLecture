package collectionrevision.day2;

import java.util.Comparator;

public class CenturiesBy implements Comparator<Player> {


    @Override
    public int compare(Player p1, Player p2) {
        if(p1.getCenturies() < p2.getCenturies()){
            return 1;
        }else {
            return -1;
        }
    }
}
