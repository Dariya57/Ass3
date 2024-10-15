package src.main;

class VegetarianPizza implements Pizza {
    public String getDescription() {
        return "Vegetarian Pizza";
    }

    public double getCost() {
        return 10.00;
    }
}
