package app.adapter;

/*
 * Adaptee
 */
public class EnemyRobotAdaptee {

    public void attackWithHands() {
        System.out.println("Robot attacks with hands and deals 10 damage");
    }

    public void walk() {
        System.out.println("Robot walks");
    }

    public void reactToHuman() {
        System.out.println("Robot tramps on human");
    }
}
