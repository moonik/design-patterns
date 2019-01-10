package app.factory.abstractf;

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
