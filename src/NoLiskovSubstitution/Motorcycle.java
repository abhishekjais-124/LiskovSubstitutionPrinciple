package NoLiskovSubstitution;

public class Motorcycle implements Bike{

    Boolean engineStart = false;
    int speed = 0;

    @Override
    public void turnOnEngine() {
        this.engineStart = true;
    }

    @Override
    public void accelerate() {
        this.speed += 1;
    }
}
