package LiskovSubstitution;

// If we use the object of kawasakiMotorcycle in place of Motorcycle, the code will not break as we have added only extra functionality
// not reduced any property

public class Motorcycle implements Bike {

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
