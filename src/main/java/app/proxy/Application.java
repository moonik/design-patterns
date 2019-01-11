package app.proxy;

public class Application {

    public static void main(final String[] arguments) {
        Image image1 = new ProxyImage("Photo1");
        Image image2 = new ProxyImage("Photo2");

        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary
    }
}
