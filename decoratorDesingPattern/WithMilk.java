package decoratorDesingPattern;

public class WithMilk extends CoffeeDecorator{

    public WithMilk(Coffee designedCoffe) {
        super(designedCoffe);
    }

    @Override
    public double getCost() {
        return designedCoffe.getCost() + 0.25;
    }

    @Override
    public String getIngredients() {
        return designedCoffe.getIngredients() + ",Milk";
    }
}
