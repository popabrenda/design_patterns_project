package factories;

import models.Marker;
import models.Stationery;

public class MarkerFactory implements StationeryFactory {
    @Override
    public Stationery createItem(String name, double price) {
        return new Marker(name, price, "permanent");
    }
}
