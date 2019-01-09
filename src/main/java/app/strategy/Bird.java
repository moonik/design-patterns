package app.strategy;

public class Bird extends Animal {

    public Bird() {
        super();

        // We set the Fly interface polymorphically
        // This sets the behavior as a non-flying Animal
        setFlyingType(new CanFly());
    }
}
