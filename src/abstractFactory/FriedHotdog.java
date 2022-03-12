package abstractFactory;

public class FriedHotdog implements Food {
    @Override
    public void cook() {
        System.out.println("Now cooking a Fried Hotdog!");
    }
}
