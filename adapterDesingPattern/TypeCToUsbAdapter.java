package adapterDesingPattern;

public class TypeCToUsbAdapter implements UsbComputer {
    TypeCComputer typeCComputer;

    public TypeCToUsbAdapter(TypeCComputer typeCComputer) {
        this.typeCComputer = typeCComputer;
    }

    @Override
    public void useUsb() {
        System.out.println("Usb connected.");
        typeCComputer.useTypeC();
    }

    @Override
    public void recharge() {
        typeCComputer.recharge();
    }
}
