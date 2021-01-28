package visitorDesignPattern;

public interface ComputerVisitor {
     void visit(Computer computer);
     void visit(Mouse mouse);
     void visit(Keyboard keyboard);
     void visit(Monitor monitor);
}
