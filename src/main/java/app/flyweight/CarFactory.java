package app.flyweight;

import java.util.HashMap;
import java.util.Map;

import app.flyweight.Car.Model;

/**
 * Flyweight uses cache to check
 * whether object has been already created
 */
public class CarFactory {

    private static Map<Model, Car> cache = new HashMap<>();

    public static Car getCar(Model model) {
        Car car = cache.get(model);
        if (car == null) {
            car = new Car(model);
            cache.put(model, car);
        }
        return car;
    }
}
