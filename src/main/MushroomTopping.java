package src.main;

public class MushroomTopping extends ToppingDecorator {
    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }

    public double getCost() {
        return pizza.getCost() + 1.50;
    }
}