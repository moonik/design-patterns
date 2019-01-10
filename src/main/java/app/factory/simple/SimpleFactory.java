package app.factory.simple;

import app.factory.Archer;
import app.factory.Enemy;
import app.factory.Warrior;

public class SimpleFactory {

    public static Enemy createEnemy(String name) {
        if (name.equals("Archer")) {
            return new Archer();
        } else if (name.equals("Warrior")) {
            return new Warrior();
        }
        return null;
    }
}
