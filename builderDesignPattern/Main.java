package builderDesignPattern;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        MacBuilder macBuilder = new MacBuilder();
        director.createMac(macBuilder);
        Mac mac = macBuilder.getComputer();
        System.out.println(mac.toString());

        LenovoBuilder lenovoBuilder = new LenovoBuilder();
        director.createLenovo(lenovoBuilder);
        Lenovo lenovo = lenovoBuilder.getComputer();
        System.out.println(lenovo.toString());
    }
}
