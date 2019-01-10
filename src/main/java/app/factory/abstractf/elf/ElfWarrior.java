package app.factory.abstractf.elf;

import app.factory.abstractf.Warrior;

public class ElfWarrior implements Warrior {

    @Override
    public void attack() {
        System.out.println("Deals 50 damage");
    }
}
