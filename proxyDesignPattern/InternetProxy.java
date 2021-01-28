package proxyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet {
    private RealInternet realInternet = new RealInternet();
    private static List<String> bannedInternetList = new ArrayList<>();



    static {
    bannedInternetList.add("facebook");
    bannedInternetList.add("instagram");
    bannedInternetList.add("ahaber.com");
    }
    @Override
    public void connectTo(String serverHost) throws Exception {
        if(bannedInternetList.contains(serverHost)) throw new Exception("Connect denied.");
        realInternet.connectTo(serverHost);
    }
}
