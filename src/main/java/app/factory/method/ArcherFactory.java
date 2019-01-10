package app.factory.method;

import app.factory.Archer;
import app.factory.Enemy;

public class ArcherFactory implements FactoryMethod {

    @Override
    public Enemy createEnemy() {
        return new Archer();
    }
}
