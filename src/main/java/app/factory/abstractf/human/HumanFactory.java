package app.factory.abstractf.human;

import app.factory.abstractf.CharacterFactory;
import app.factory.abstractf.Mage;
import app.factory.abstractf.Warrior;

public class HumanFactory extends CharacterFactory {

    @Override
    protected Mage createMage() {
        return new HumanMage();
    }

    @Override
    protected Warrior createWarrior() {
        return new HumanWarrior();
    }
}
