package app.factory;

public class Enemy {

    private String name;
    private Double damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDamage() {
        return damage;
    }

    public void setDamage(Double damage) {
        this.damage = damage;
    }

    public void attack() {
        System.out.println(name + " attacks you and does " + damage + " damage");
    }
}
