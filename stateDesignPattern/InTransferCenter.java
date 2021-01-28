package stateDesignPattern;

public class InTransferCenter extends State {

    public InTransferCenter(Shipment shipment) {
        super(shipment);
    }

    @Override
    public void getInfo() {
        System.out.println("Shipment is in transfer center.");
    }

    @Override
    public void toNext() {
        shipment.setState(new InDeliveryBranch(shipment));
    }
}
