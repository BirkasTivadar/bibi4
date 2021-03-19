package methodoverloading.pub;

import methodoverloading.Time;

public class Pub implements Comparable<Pub> {

    private String name;
    private int hours;
    private int minutes;

    public Pub(String name, int hours, int minutes) {
        this.name = name;
        this.hours = hours;
        this.minutes = minutes;
    }

    public String getName() {
        return name;
    }

    public Time getOpenFrom() {
        return new Time(hours, minutes);
    }

    @Override
    public int compareTo(Pub o) {
        return this.getOpenFrom().compareTo(o.getOpenFrom());
    }

    @Override
    public String toString() {
        return String.format("%s;%d:%d", name, hours, minutes);
    }
}
