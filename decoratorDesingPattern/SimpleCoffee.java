package decoratorDesingPattern;

public class SimpleCoffee implements Coffee
{
    @Override
    public double getCost() {
        return 5.00;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
}
