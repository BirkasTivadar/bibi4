package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target) {
        moveTrooper(findTrooperByName(name), target);
    }

    public void moveClosestTrooper(Position target) {
        moveTrooper(findClosestTrooper(target), target);
    }

    private Trooper findTrooperByName(String name) {
        if (troopers.isEmpty()) {
            throw new IllegalArgumentException("List of troopers is empty.");
        }
        for (Trooper trooper : troopers) {
            if (trooper.getName().equals(name)) {
                return trooper;
            }
        }
        throw new IllegalArgumentException("Cannot find trooper.");
    }

    private void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }

    private Trooper findClosestTrooper(Position target) {
        if (troopers.isEmpty()) {
            throw new IllegalArgumentException("List of troopers is empty.");
        }
        Trooper closestTrooper = troopers.get(0);
        double distance = closestTrooper.distanceFrom(target);
        for (Trooper trooper : troopers) {
            if (trooper.distanceFrom(target) < distance) {
                closestTrooper = trooper;
            }
        }
        return closestTrooper;
    }
}