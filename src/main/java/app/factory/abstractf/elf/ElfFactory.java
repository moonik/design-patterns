package app.factory.abstractf.elf;

import app.factory.abstractf.CharacterFactory;
import app.factory.abstractf.Mage;
import app.factory.abstractf.Warrior;

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
