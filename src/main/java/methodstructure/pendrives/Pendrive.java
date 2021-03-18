package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public void risePrice(int percent) {
        price += price * percent / 100;
    }

    public int comparePricePerCapacity(Pendrive pendrive) {
        if (this.getPricePerCapacity() > pendrive.getPricePerCapacity()) {
            return 1;
        } else if (this.getPricePerCapacity() == pendrive.getPricePerCapacity()) {
            return 0;
        }
        return -1;
    }

    private double getPricePerCapacity() {
        return (double) price / capacity;
    }

    public boolean cheaperThan(Pendrive pendrive) {
        return this.price < pendrive.price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
