package abstractFactoryDesignPattern;

public class Main {
    public static Application applicationConfigure(){
        Application application;
        GUIFactory guiFactory;

        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            guiFactory = new MacOsFactory();
            application = new Application(guiFactory);
            return application;
        }else{
            guiFactory = new WindowsFactory();
            application = new Application(guiFactory);
            return application;
        }
    }

    public static void main(String[] args) {
        Application application = applicationConfigure();
        application.print();
    }
}
