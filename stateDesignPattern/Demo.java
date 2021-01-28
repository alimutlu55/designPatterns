package stateDesignPattern;

public class Demo {
    public static void main(String[] args) {
        Shipment shipment = new Shipment();
        shipment.getInfo();

        shipment.toNext();
        shipment.getInfo();

        shipment.toNext();
        shipment.getInfo();

        shipment.toNext();
        shipment.getInfo();

        shipment.toNext();
        shipment.getInfo();
    }
}
