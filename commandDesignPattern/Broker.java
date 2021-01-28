package commandDesignPattern;

import java.util.List;

public class Broker {
    List<Order> orderList;

    public Broker(List<Order> orderList) {
        this.orderList = orderList;
    }

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrder(){
        for(Order order:orderList){
            order.execute();
        }
    }
}
