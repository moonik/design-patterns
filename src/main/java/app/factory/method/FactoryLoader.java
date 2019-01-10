package app.factory.method;

public class FactoryLoader {

    public static FactoryMethod getFactory(String name) {
        if (name.equals("Archer")) {
            return new ArcherFactory();
        } else if (name.equals("Warrior")) {
            return new WarriorFactory();
        }
        return null;
    }
}
