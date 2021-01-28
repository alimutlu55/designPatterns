package builderDesignPattern;

public class LenovoBuilder implements ComputerBuilder {
    Lenovo lenovo;

    public LenovoBuilder() {
        this.lenovo = new Lenovo();
    }

    @Override
    public void setOS(String oS) {
        lenovo.setoS(oS);
    }

    @Override
    public void setScreen(String screen) {
        lenovo.setScreen(screen);
    }

    @Override
    public void setKeyboard(String keyboard) {
        lenovo.setKeyBoard(keyboard);
    }

    @Override
    public void setTouchpad(String touchpad) {
        lenovo.setTouchPad(touchpad);
    }

    public Lenovo getComputer(){
        return this.lenovo;
    }
}
