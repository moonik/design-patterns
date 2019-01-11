package app.decorator;

public class PizzaMaker {

    public static void main(String[] args) {
        Pizza pizza = new TomatoSouce(new Mozzarella(new PlainPizza()));
        System.out.println(pizza.getDescription() + " : " + pizza.getCost());
    }
}
