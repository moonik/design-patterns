package app.adapter;

public class EnemyTank implements EnemyAttacker {

    @Override
    public void fireWeapon() {
        System.out.println("Enemy tank deals 50 damage");
    }

    @Override
    public void drive() {
        System.out.println("Enemy tank drives forward");
    }

    @Override
    public void assignDriver() {
        System.out.println("Assigned driver to enemy tank");
    }
}
