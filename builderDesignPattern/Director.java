package builderDesignPattern;

public class Director {

    public void createMac(ComputerBuilder computerBuilder){
        computerBuilder.setOS("Mac OS");
        computerBuilder.setTouchpad("Mac Touchpad");
    }

    public void createLenovo(ComputerBuilder computerBuilder){
        computerBuilder.setOS("Lenovo OS");
        computerBuilder.setKeyboard("Lenovo Keyboard");
        computerBuilder.setScreen("Lenovo Screen");
        computerBuilder.setTouchpad("Lenovo Touchpad");
    }
}
