package visitorDesignPattern;

public class Computer implements ComputerPart{
    private ComputerPart[] computerParts;

    public Computer() {
        computerParts = new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(ComputerPart computerPart:computerParts){
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
