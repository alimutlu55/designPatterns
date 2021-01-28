package decoratorDesingPattern;

public  class CoffeeDecorator implements Coffee  {
    Coffee designedCoffe;

    public CoffeeDecorator(Coffee designedCoffe) {
        this.designedCoffe = designedCoffe;
    }

    @Override
    public double getCost() {
        return designedCoffe.getCost();
    }

    @Override
    public String getIngredients() {
        return designedCoffe.getIngredients();
    }
}
