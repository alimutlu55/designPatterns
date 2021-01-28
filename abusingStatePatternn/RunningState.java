package abusingStatePatternn;

public class RunningState implements IState {

    private Stopwatch stopwatch;

    public RunningState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        this.stopwatch.setCurrentState(new StopState(stopwatch));
        System.out.println("Stopwatch is stopped.");
    }
}
