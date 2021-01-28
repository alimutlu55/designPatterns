package decoratorDesingPattern;

public class Demo {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        print(coffee);

        coffee = new WithMilk(coffee);
        print(coffee);

        coffee = new WithSprinkles(coffee);
        print(coffee);



    }

    public static void print(Coffee c){
        System.out.println(c.getIngredients());
        System.out.println(c.getCost());
    }
}
