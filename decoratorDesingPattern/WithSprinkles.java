package decoratorDesingPattern;

public class WithSprinkles extends CoffeeDecorator{

    public WithSprinkles(Coffee designedCoffe) {
        super(designedCoffe);
    }

    @Override
    public double getCost() {
        return designedCoffe.getCost() + 0.30;
    }

    @Override
    public String getIngredients() {
        return designedCoffe.getIngredients() + ",Sprinkles";
    }
}
