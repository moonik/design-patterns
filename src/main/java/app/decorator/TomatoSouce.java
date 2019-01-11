package app.decorator;

public class TomatoSouce extends ToppingDecorator {

    public TomatoSouce(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Tomato souce";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + .25;
    }
}
