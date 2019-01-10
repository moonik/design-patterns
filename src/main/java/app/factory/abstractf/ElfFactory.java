package app.factory.abstractf;

public class ElfFactory extends CharacterFactory {

    @Override
    protected Mage createMage() {
        return new ElfMage();
    }

    @Override
    protected Warrior createWarrior() {
        return new ElfWarrior();
    }
}
