package abstractFactory;

public class GrilledHotdog implements Food {
    @Override
    public void cook() {
        System.out.println("Now cooking a Grilled Hotdog!");
    }
}
