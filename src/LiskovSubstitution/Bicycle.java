package LiskovSubstitution;

// Now Bicycle will behave as a cycle. We didn't reduced any functionality

public class Bicycle implements Cycle {

    int speed = 0;

    @Override
    public void accelerate() {
        this.speed += 1;
    }
}
