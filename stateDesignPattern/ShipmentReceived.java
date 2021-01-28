package stateDesignPattern;

public class ShipmentReceived extends State {

    public ShipmentReceived(Shipment shipment) {
        super(shipment);
    }

    @Override
    public void getInfo() {
        System.out.println("Shipment has received.");
    }

    @Override
    public void toNext() {
        shipment.setState(new InTransferCenter(shipment));
    }
}
