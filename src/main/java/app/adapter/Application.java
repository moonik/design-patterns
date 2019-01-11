package app.adapter;

public class Application {

    public static void main(String[] args) {
        EnemyTank tank = new EnemyTank();
        EnemyRobotAdaptee robot = new EnemyRobotAdaptee();
        EnemyRobotAdapter robotAdapter = new EnemyRobotAdapter(robot);

        System.out.println("Robot");
        robot.attackWithHands();
        robot.walk();
        robot.reactToHuman();

        System.out.println("Tank");
        tank.fireWeapon();
        tank.drive();
        tank.assignDriver();

        System.out.println("Adapter");
        robotAdapter.fireWeapon();
        robotAdapter.drive();
        robotAdapter.assignDriver();
    }
}
