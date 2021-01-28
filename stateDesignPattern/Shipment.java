package stateDesignPattern;

public class Shipment {
    State state;

    public Shipment() {
        this.state = new ShipmentReceived(this);
    }

    public void getInfo(){
        state.getInfo();
    }
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void toNext(){
        state.toNext();
    }
}
