package app.factory.method;

import app.factory.Enemy;
import app.factory.Warrior;

public class WarriorFactory implements FactoryMethod {

    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }
}
