package strategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        AddOperation addOperation = new AddOperation();
        Substract substractOperation = new Substract();
        Multiplication multiplicationOperation = new Multiplication();


        MathOperations add = new MathOperations(addOperation);
        add.doOperations(5,10);

        MathOperations substract = new MathOperations(substractOperation);
        substract.doOperations(10,5);

        MathOperations multiplication = new MathOperations(multiplicationOperation);
        multiplication.doOperations(10,5);

    }
}
