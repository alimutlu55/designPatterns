package abstractFactoryDesignPattern;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void print() {
        System.out.println("Windows checkbox is printed.");
    }
}
