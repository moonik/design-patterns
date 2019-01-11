package app.proxy;

import app.proxy.image.Image;
import app.proxy.image.ProxyImage;
import app.proxy.internet.Internet;
import app.proxy.internet.ProxyInternet;

public class Application {

    public static void main(final String[] arguments) {
        //first example
        Image image1 = new ProxyImage("Photo1");
        Image image2 = new ProxyImage("Photo2");

        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary

        //second example
        Internet internet = new ProxyInternet();
        internet.connect("abc.com");
        internet.connect("somehost.com");
    }
}
