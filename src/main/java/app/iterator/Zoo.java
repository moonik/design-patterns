package app.iterator;

import java.util.Iterator;

public class Zoo {

    public static void main(String[] args) {
        LionCollection lions = new LionCollection();
        TigerCollection tigers = new TigerCollection();

        printAllAnimals(lions.getIterator());
        printAllAnimals(tigers.getIterator());
    }

    private static void printAllAnimals(Iterator iterator) {
        while (iterator.hasNext()) {
            Animal animal = (Animal) iterator.next();
            System.out.println(animal.getType() + " : " + animal.getName());
        }
    }
}
