package factoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        try {
            Coffee coffee =  CoffeeFactory.getCoffeeInstance(TurkishCoffee.class);
            coffee.addSugar(5);
            coffee.makeCoffee();
            /* TurkishCoffee coffee = (TurkishCoffee) CoffeeFactory.makeCoffee(TurkishCoffee.class);
             * coffee.makeCoffee();
             * coffee.addSugar(5);
             */
            //


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
