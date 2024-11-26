package models;

public class Marker extends Stationery {
    private String markerType;

    public Marker(String name, double price, String markerType) {
        super(name, price);
        this.markerType = markerType;
    }

    @Override
    public String toString() {
        return super.toString() + " [Type: " + markerType + "]";
    }
}
