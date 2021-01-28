package adapterDesingPattern;

public class Main {
    public static void main(String[] args) {
        Mac mac = new Mac();
        Lenovo lenovo = new Lenovo();

        mac.useTypeC();
        mac.recharge();
        lenovo.useUsb();
        lenovo.recharge();

        //Adapter kullanarak Type C girişi olan Mac ' e usb ile bağlandık. Usb gibi davranıyor(Interface) ama typeC görevi görüyor.
        TypeCToUsbAdapter typeCToUsbAdapter = new TypeCToUsbAdapter(mac);
        typeCToUsbAdapter.useUsb();
        typeCToUsbAdapter.recharge();

    }
}
