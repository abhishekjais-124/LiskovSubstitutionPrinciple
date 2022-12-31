package LiskovSubstitution;

public class KawasakiMotorcycle extends Motorcycle{
    String name;

    public KawasakiMotorcycle(){
        this.name = "kawasaki";
    }

    @Override
    public void accelerate() {
        this.speed += 10;
    }

    public void showSuperBikeLicense(){}
}
