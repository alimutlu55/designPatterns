package stateDesignPattern;

public class ShipmentDelivered extends State{

    public ShipmentDelivered(Shipment shipment) {
        super(shipment);
    }

    @Override
    public void getInfo() {
        System.out.println("Your shipment is delivered.");
    }

    @Override
    public void toNext() {
        System.out.println("Your shipment is delivered.");
    }
}
