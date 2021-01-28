package proxyDesignPattern;

public class Demo {
    public static void main(String[] args) {
        try
        {
            Internet internet = new InternetProxy();
            internet.connectTo("letgo");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
