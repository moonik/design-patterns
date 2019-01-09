package app.strategy;

// The interface is implemented by many other
// subclasses that allow for many types of flying
// without effecting Animal, or Flys.
// Classes that implement new Flys interface
// subclasses can allow other classes to use
// that code eliminating code duplication
// I'm decoupling : encapsulating the concept that varies
public interface Fly {

    String fly();
}

// class is used if animal can fly
class CanFly implements Fly {

    public String fly() {
        return "Flyyyyyy....";
    }
}

//class is used if animal can't fly
class CantFly implements Fly {

    public String fly() {
        return "I can't fly, dude :c";
    }
}