package abstractFactory;

public class GrilledFactory extends AbstractFactory {
    @Override
    Food getFood(String foodType) {
        if(foodType.equalsIgnoreCase("Fish")){
            return new GrilledFish();
        }else if(foodType.equalsIgnoreCase("Hotdog")){
            return new GrilledHotdog();
        }
        return null;
    }
}
