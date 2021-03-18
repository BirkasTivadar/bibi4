package methodpass.troopers;

public class Trooper {

    private String name;
    private Position position;

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public Trooper(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
        position = new Position(0, 0);
    }

    public void changePosition(Position target) {
        if (target == null) {
            throw new IllegalArgumentException(("Target must not be null."));
        }
        position = new Position(target.getPosX(), target.getPosY());
    }

    public double distanceFrom(Position target) {
        return position.distanceFrom(target);
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }
}
