package factoryDesignPattern;

public class CoffeeFactory {

    public static Coffee getCoffeeInstance (Class coffeeClass) throws Exception {
        if(coffeeClass == null) {
            return null;
        }
        return (Coffee) coffeeClass.newInstance();
    }
}
