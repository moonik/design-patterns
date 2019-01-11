package app.adapter;

public class EnemyRobotAdapter implements EnemyAttacker {

    private EnemyRobotAdaptee robot;

    public EnemyRobotAdapter(EnemyRobotAdaptee robot) {
        this.robot = robot;
    }

    @Override
    public void fireWeapon() {
        robot.attackWithHands();
    }

    @Override
    public void drive() {
        robot.walk();
    }

    @Override
    public void assignDriver() {
        robot.reactToHuman();
    }
}
