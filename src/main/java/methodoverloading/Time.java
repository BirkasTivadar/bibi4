package methodoverloading;

import java.util.Objects;

public class Time implements Comparable<Time> {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(int hours, int minutes) {
        this(hours);
        this.minutes = minutes;
    }

    public Time(int hours, int minutes, int seconds) {
        this(hours, minutes);
        this.seconds = seconds;
    }

    public Time(Time time) {
        this(time.hours, time.minutes, time.seconds);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isEqual(Time time) {
        return this.equals(time);
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        return this.equals(new Time(hours, minutes, seconds));
    }

    @Override
    public int compareTo(Time o) {
        if (hours == o.hours) {
            if (minutes == o.minutes) {
                return seconds - o.seconds;
            }
            return minutes - o.minutes;
        }
        return hours - o.hours;
    }

    public boolean isEarlier(Time time) {
        return this.compareTo(time) < 0;
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        return this.compareTo(new Time(hours, minutes, seconds)) < 0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hours == time.hours && minutes == time.minutes && seconds == time.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes, seconds);
    }
}
