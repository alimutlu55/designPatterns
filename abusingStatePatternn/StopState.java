package abusingStatePatternn;

public class StopState implements IState {
    private Stopwatch stopwatch;

    public StopState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        this.stopwatch.setCurrentState(new RunningState(stopwatch));
        System.out.println("Stopwatch is running.");
    }
}
