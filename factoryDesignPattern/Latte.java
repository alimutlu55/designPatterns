package factoryDesignPattern;

public class Latte extends AbstractCoffee {
    @Override
    public void makeCoffee() {
        System.out.println("Your" + this.getClass().getSimpleName() + " is readyyyyy.");
    }
}
