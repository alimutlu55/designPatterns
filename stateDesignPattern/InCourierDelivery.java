package stateDesignPattern;

public class InCourierDelivery extends State{

    public InCourierDelivery(Shipment shipment) {
        super(shipment);
    }

    @Override
    public void getInfo() {
        System.out.println("Shipment is in courier delivery.");
    }

    @Override
    public void toNext() {
        shipment.setState(new ShipmentDelivered(shipment));
    }
}
