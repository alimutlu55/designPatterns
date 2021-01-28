package strategyDesignPattern;

public class MathOperations {
    Math math;

    public MathOperations(Math math) {
        this.math = math;
    }

    public void doOperations(int x,int y){
        math.doOperation(x,y);
    }
}
