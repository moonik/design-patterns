package app.factory.abstractf.elf;

import app.factory.abstractf.Mage;

public class ElfMage implements Mage {

    @Override
    public void cast() {
        System.out.println("Casts frostbolt");
    }
}
