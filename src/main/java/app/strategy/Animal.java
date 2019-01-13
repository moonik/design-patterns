package app.strategy;

public class Animal {

    private String name;

    // Instead of using an interface in a traditional way
    // we use an instance variable that is a subclass
    // of the Fly interface.
    // Animal doesn't care what flyingType does, it just
    // knows the behavior is available to its subclasses
    // This is known as Composition : Instead of inheriting
    // an ability through inheritance the class is composed
    // with Objects with the right ability
    // Composition allows you to change the capabilities of
    // objects at run time!
    private Fly flyingType;

    // Animal pushes off the responsibility for flying to flyingType
    public String tryToFly() {
        return flyingType.fly();
    }

    // If you want to be able to change the flyingType dynamically
    // add the following method
    public void setFlyingType(Fly flyingType) {
        this.flyingType = flyingType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
