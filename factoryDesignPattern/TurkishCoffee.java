package factoryDesignPattern;

public class TurkishCoffee extends AbstractCoffee {
    @Override
    public void makeCoffee() {
        System.out.println("Your " + this.getClass().getSimpleName()  + " is readyyyy.");
    }
}
