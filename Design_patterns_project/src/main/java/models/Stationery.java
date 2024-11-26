package models;

public abstract class Stationery {
    protected String name;
    protected double price;

    public Stationery(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
