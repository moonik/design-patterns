package app.strategy;

public class Application {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println("Dog says: " + dog.tryToFly());
        System.out.println("Bird says: " + bird.tryToFly());

        dog.setFlyingType(new CanFly());
        System.out.println("Dog tries again: " + dog.tryToFly());
    }
}
