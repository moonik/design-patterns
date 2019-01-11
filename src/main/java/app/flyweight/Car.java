package app.flyweight;

public class Car {

    private Model model;

    public Car(Model model) {
        this.model = model;
    }

    enum Model {
        BWM, AUDI, FORD
    }
}
