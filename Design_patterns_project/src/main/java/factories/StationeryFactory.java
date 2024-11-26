package factories;

import models.Stationery;

public interface StationeryFactory {
    Stationery createItem(String name, double price);
}
