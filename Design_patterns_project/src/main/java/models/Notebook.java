package models;

public class Notebook extends Stationery {
    private int numberOfPages;

    public Notebook(String name, double price, int numberOfPages) {
        super(name, price);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return super.toString() + " [Pages: " + numberOfPages + "]";
    }
}
