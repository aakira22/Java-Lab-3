package abstractFactory;

public class FriedFactory extends AbstractFactory {
    @Override
    Food getFood(String foodType) {
        if(foodType.equalsIgnoreCase("Fish")){
            return new FriedFish();
        }else if(foodType.equalsIgnoreCase("Hotdog")){
            return new FriedHotdog();
        }
        return null;
    }
}
