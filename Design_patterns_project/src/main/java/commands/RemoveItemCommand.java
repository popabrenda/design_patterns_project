package commands;

import models.Stationery;
import shopping.ShoppingCart;

public class RemoveItemCommand implements Command {
    private ShoppingCart cart;
    private Stationery item;

    public RemoveItemCommand(ShoppingCart cart, Stationery item) {
        this.cart = cart;
        this.item = item;
    }

    @Override
    public void execute() {
        cart.removeItem(item);
    }

    @Override
    public void undo() {
        cart.addItem(item);
    }
}
