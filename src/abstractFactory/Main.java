package abstractFactory;

public class Main {

    AbstractFactory foodFactory = FoodProducer.getFactory(true);

    Food food1 = foodFactory.getFood("fish");

    food1.cook();

    Food food2 = foodFactory.getFood("hotdog");

    food2.cook();

    AbstractFactory shapeFactory1 = FoodProducer.getFactory(false);

    Food food3 = foodFactory.getFood("fish");

    food3.cook();

    Food food4 = foodFactory.getFood("hotdog");

    food4.cook();
}
