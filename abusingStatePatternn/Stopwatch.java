package abusingStatePatternn;

public class Stopwatch {
    private IState currentState = new StopState(this);

    public void click(){
        this.currentState.click();
    }

    public IState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(IState currentState) {
        this.currentState = currentState;
    }
}
