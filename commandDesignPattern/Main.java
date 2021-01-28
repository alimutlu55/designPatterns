package commandDesignPattern;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[4];
        ints[0] = 0;
        ints[1] = 1;
        ints[2] = 2;

        Stock stock = new Stock();
        Broker broker = new Broker(new ArrayList<>());
        broker.takeOrder(new SellStock(stock));
        broker.takeOrder(new BuyStock(stock));
        broker.placeOrder();
    }
}
