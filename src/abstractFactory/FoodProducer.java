package abstractFactory;

public class FoodProducer {
    public static AbstractFactory getFactory(boolean fried);
        if(fried){
        return new FriedFactory();
    }else{
        return new GrilledFactory();
    }
}
