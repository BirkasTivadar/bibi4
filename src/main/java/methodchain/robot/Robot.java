package methodchain.robot;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    public int distance;
    public int azimut;
    List<String> navigationList = new ArrayList<>();

    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }

    public List<String> getNavigationList() {
        return navigationList;
    }

    public Robot go(int meter) {
        distance += meter;
        return this;
    }

    public Robot rotate(int angle) {
        azimut += angle;
        return this;
    }

    public Robot registerNavigationPoint() {
        navigationList.add(this.toString());
        return this;
    }

    @Override
    public String toString() {
        return String.format("distance: %d azimut: %d", distance, azimut);
    }
}
