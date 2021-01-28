package visitorDesignPattern;

public class Main {
    public static void main(String[] args) {

         ComputerPart monitor = new Monitor();
         monitor.accept(new ComputerPartVisitor());

         Computer computerPart = new Computer();
         computerPart.accept(new ComputerPartVisitor());
    }
}
