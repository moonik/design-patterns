package app.factory;

import app.factory.method.ArcherFactory;
import app.factory.method.FactoryMethod;
import app.factory.method.WarriorFactory;
import app.factory.simple.SimpleFactory;

public class Application {

    public static void main(String[] args) {
        // Simple Factory test
        System.out.println("Simple Factory test...");
        Enemy archer = SimpleFactory.createEnemy("Archer");
        archer.attack();
        Enemy warrior = SimpleFactory.createEnemy("Warrior");
        warrior.attack();

        //Factory Method test
        factoryMethodTest();
    }

    private static void factoryMethodTest() {
        System.out.println("Factory Method test...");
        Enemy archer = createEnemy(new ArcherFactory());
        archer.attack();
        Enemy warrior = createEnemy(new WarriorFactory());
        warrior.attack();
    }
    
    private static Enemy createEnemy(FactoryMethod factoryMethod) {
        return factoryMethod.createEnemy();
    }
}
