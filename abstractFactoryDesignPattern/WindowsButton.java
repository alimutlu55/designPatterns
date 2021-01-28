package abstractFactoryDesignPattern;

public class WindowsButton implements Button{

    @Override
    public void print() {
        System.out.println("Windows button is printed.");
    }
}
