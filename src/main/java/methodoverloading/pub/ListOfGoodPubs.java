package methodoverloading.pub;

import java.util.List;
import java.util.TreeSet;

public class ListOfGoodPubs {

    private List<Pub> goodPubs;

    public ListOfGoodPubs(List<Pub> goodPubs) {
        if (goodPubs.isEmpty()) {
            throw new IllegalArgumentException("Pub list is empty!");
        }
        this.goodPubs = goodPubs;
    }

    public Pub findTheBest() {
        return new TreeSet<>(goodPubs).first();
    }

}
