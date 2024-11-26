package models;

public class Pen extends Stationery {
    private String inkColor;

    public Pen(String name, double price, String inkColor) {
        super(name, price);
        this.inkColor = inkColor;
    }

    @Override
    public String toString() {
        return super.toString() + " [Ink Color: " + inkColor + "]";
    }
}
