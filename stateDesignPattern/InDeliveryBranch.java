package stateDesignPattern;

public class InDeliveryBranch extends State{

    public InDeliveryBranch(Shipment shipment) {
        super(shipment);
    }

    @Override
    public void getInfo() {
        System.out.println("Shipment is in delivery branch.");
    }

    @Override
    public void toNext() {
        shipment.setState(new InCourierDelivery(shipment));
    }
}
