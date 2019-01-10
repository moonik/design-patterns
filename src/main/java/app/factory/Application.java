package app.factory;

import app.factory.abstractf.Army;
import app.factory.abstractf.ElfFactory;
import app.factory.abstractf.HumanFactory;
import app.factory.method.FactoryLoader;
import app.factory.method.FactoryMethod;
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

        //Abstract Factory test
        abstractFactoryTest();
    }

    private static void abstractFactoryTest() {
        System.out.println("Abstract factory test...");

        Army humanArmy = new Army(new HumanFactory());
        humanArmy.addMage();
        humanArmy.addWarrior();
        humanArmy.attack();

        Army elfArmy = new Army(new ElfFactory());
        elfArmy.addWarrior();
        elfArmy.addMage();
        elfArmy.attack();
    }

    private static void factoryMethodTest() {
        System.out.println("Factory Method test...");
        FactoryMethod archerFactory = FactoryLoader.getFactory("Archer");
        Enemy archer = archerFactory.createEnemy();
        archer.attack();
        FactoryMethod warriorFactory = FactoryLoader.getFactory("Warrior");
        Enemy warrior = warriorFactory.createEnemy();
        warrior.attack();
    }
}
