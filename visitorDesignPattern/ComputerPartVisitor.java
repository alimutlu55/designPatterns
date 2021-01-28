package visitorDesignPattern;

public class ComputerPartVisitor implements ComputerVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Computer visited");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse visited");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keybord visited");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitor visited");
    }
}
