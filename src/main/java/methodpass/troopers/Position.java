package methodpass.troopers;

public class Position {

    private final double posX;
    private final double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double distanceFrom(Position other) {
        return Math.sqrt(Math.pow(posX - other.posX, 2) + Math.pow(posY - other.posY, 2));
    }
}
