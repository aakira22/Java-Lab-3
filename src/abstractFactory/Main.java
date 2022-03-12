package abstractFactory;

public class Main {
    public static void main(String[] args) {


        AbstractFactory foodFactory = FoodProducer.getFactory(true);

        Food food1 = foodFactory.getFood("fish");

        food1.cook();

        Food food2 = foodFactory.getFood("hotdog");

        food2.cook();

        AbstractFactory foodFactory1 = FoodProducer.getFactory(false);

        Food food3 = foodFactory1.getFood("fish");

        food3.cook();

        Food food4 = foodFactory1.getFood("hotdog");

        food4.cook();
    }
}
