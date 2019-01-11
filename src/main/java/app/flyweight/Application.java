package app.flyweight;

import java.util.Random;
import app.flyweight.Car.Model;

public class Application {

    public static void main(String[] args) {
        Model[] models = Model.values();

        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            CarFactory.getCar(models[random.nextInt(3)]);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime));
    }
}
