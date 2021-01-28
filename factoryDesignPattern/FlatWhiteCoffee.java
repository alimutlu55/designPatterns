package factoryDesignPattern;

public class FlatWhiteCoffee extends AbstractCoffee {
    @Override
    public void makeCoffee() {
        System.out.println("Your " + this.getClass().getSimpleName() + " is redyyyy.");
    }
}
