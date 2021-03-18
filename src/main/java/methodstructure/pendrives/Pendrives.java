package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive best(List<Pendrive> pendrives) {
        Pendrive best = pendrives.get(0);
        for (Pendrive pendrive : pendrives) {
            if (pendrive.comparePricePerCapacity(best) < 0) {
                best = pendrive;
            }
        }
        return best;
    }

    public Pendrive cheapest(List<Pendrive> pendrives) {
        Pendrive cheapest = pendrives.get(0);
        for (Pendrive pendrive : pendrives) {
            if (pendrive.cheaperThan(cheapest)) {
                cheapest = pendrive;
            }
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {
        for (Pendrive pendrive : pendrives) {
            if (pendrive.getCapacity() == capacity) {
                pendrive.risePrice(percent);
            }
        }
    }


}
