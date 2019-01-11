package app.proxy.internet;

import java.util.HashSet;
import java.util.Set;

public class ProxyInternet implements Internet {

    private RealInternet realInternet;
    private Set<String> bannedSites;

    public ProxyInternet() {
        this.realInternet = new RealInternet();
        this.bannedSites = new HashSet<>();
        this.bannedSites.add("abc.com");
        this.bannedSites.add("kek.com");

    }

    @Override
    public void connect(String host) {
        if (!bannedSites.contains(host)) {
            realInternet.connect(host);
        } else
            System.out.println("Access denied!");
    }
}
