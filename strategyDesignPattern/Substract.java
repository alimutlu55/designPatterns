package strategyDesignPattern;

public class Substract implements Math {
    @Override
    public void doOperation(int x, int y) {
        System.out.println("x-y = " + (x-y));
    }
}
