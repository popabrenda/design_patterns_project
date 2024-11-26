package factories;

import models.Pen;
import models.Stationery;

public class PenFactory implements StationeryFactory {
    @Override
    public Stationery createItem(String name, double price) {
        return new Pen(name, price, "blue");
    }
}
