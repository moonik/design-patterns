package app.factory.abstractf;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<Mage> mages;
    private List<Warrior> warriors;
    private CharacterFactory factory;

    public Army(CharacterFactory factory) {
        this.mages = new ArrayList<>();
        this.warriors = new ArrayList<>();
        this.factory = factory;
    }

    public void addMage() {
        mages.add(factory.createMage());
    }

    public void addWarrior() {
        warriors.add(factory.createWarrior());
    }

    public List<Mage> getMages() {
        return mages;
    }

    public List<Warrior> getWarriors() {
        return warriors;
    }

    public void attack() {
        mages.forEach(Mage::cast);
        warriors.forEach(Warrior::attack);
    }
}
