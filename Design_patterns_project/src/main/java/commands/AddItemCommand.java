package commands;

import models.Stationery;
import shopping.ShoppingCart;

public class AddItemCommand implements Command {
    private ShoppingCart cart;
    private Stationery item;

    public AddItemCommand(ShoppingCart cart, Stationery item) {
        this.cart = cart;
        this.item = item;
    }

    @Override
    public void execute() {
        cart.addItem(item);
    }

    @Override
    public void undo() {
        cart.removeItem(item);
    }
}
