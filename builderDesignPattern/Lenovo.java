package builderDesignPattern;

public class Lenovo {
    private String oS;
    private String screen;
    private String keyBoard;
    private String touchPad;

    public void setoS(String oS) {
        this.oS = oS;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public void setKeyBoard(String keyBoard) {
        this.keyBoard = keyBoard;
    }

    public void setTouchPad(String touchPad) {
        this.touchPad = touchPad;
    }

    @Override
    public String toString() {
        return "Lenovo{" +
                "oS='" + oS + '\'' +
                ", screen='" + screen + '\'' +
                ", keyBoard='" + keyBoard + '\'' +
                ", touchPad='" + touchPad + '\'' +
                '}';
    }
}
