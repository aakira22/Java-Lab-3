package abstractFactory;

public class GrilledFish implements Food {
    @Override
    public void cook() {
        System.out.println("Now cooking a Grilled Fish!");
    }
}
