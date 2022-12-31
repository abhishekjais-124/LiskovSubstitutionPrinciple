package NoLiskovSubstitution;

// Bicycle will behave different when we are using its object. We reduced the bike functionality instead of improving

public class Bicycle implements Bike{

    int speed = 0;

    // ERROR: We narrowed down the bike property
    @Override
    public void turnOnEngine() {
        // return new AssertionError("Bicycle has no engines");
    }

    @Override
    public void accelerate() {
        this.speed += 1;
    }
}
