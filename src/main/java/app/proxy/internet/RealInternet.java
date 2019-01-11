package app.proxy.internet;

public class RealInternet implements Internet {

    @Override
    public void connect(String host) {
        System.out.println("Connected to " + host);
    }
}
