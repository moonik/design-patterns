package app.factory.abstractf.human;

import app.factory.abstractf.Warrior;

public class HumanWarrior implements Warrior {

    @Override
    public void attack() {
        System.out.println("Human attacks");
    }
}
