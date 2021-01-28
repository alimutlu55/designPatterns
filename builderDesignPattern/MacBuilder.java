package builderDesignPattern;

public class MacBuilder implements ComputerBuilder{
    Mac mac;

    public MacBuilder() {
        this.mac = new Mac();
    }

    @Override
    public void setOS(String oS) {
        mac.setoS(oS);
    }

    @Override
    public void setScreen(String screen) {
        mac.setScreen(screen);
    }

    @Override
    public void setKeyboard(String keyboard) {
        mac.setKeyBoard(keyboard);
    }

    @Override
    public void setTouchpad(String touchpad) {
        mac.setKeyBoard(touchpad);
    }

    public Mac getComputer() {
        return this.mac;
    }
}
