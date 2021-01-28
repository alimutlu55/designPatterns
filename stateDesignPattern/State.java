package stateDesignPattern;

public abstract class State {
    Shipment shipment;

    public State(Shipment shipment) {
        this.shipment = shipment;
    }

    public abstract void getInfo();
    public abstract void toNext();
}
