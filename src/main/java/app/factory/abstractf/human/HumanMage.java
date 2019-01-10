package app.factory.abstractf.human;

import app.factory.abstractf.Mage;

public class HumanMage implements Mage {

    @Override
    public void cast() {
        System.out.println("Casts firebolt");
    }
}
