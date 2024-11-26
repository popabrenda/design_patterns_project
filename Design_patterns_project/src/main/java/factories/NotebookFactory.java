package factories;

import models.Notebook;
import models.Stationery;

public class NotebookFactory implements StationeryFactory {
    @Override
    public Stationery createItem(String name, double price) {
        return new Notebook(name, price, 100);
    }
}
