package adapterDesingPattern;

public class Lenovo implements UsbComputer {
    private boolean connector;

    @Override
    public void useUsb() {
        connector = true;
        System.out.println("Usb connected");
    }

    @Override
    public void recharge() {
        if(connector){
            System.out.println("Recharge started.");
            System.out.println("Recharge finished.");
        }else{
            System.out.println("Connect Usb first.");
        }
    }
}
