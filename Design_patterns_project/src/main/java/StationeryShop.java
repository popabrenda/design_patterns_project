import factories.*;
import models.*;
import shopping.*;
import commands.*;

public class StationeryShop {
    public static void main(String[] args) {

        StationeryFactory penFactory = new PenFactory();
        StationeryFactory notebookFactory = new NotebookFactory();
        StationeryFactory markerFactory = new MarkerFactory();


        Stationery pen = penFactory.createItem("Pen", 1.50);
        Stationery notebook = notebookFactory.createItem("Pink Notebook", 4.50);
        Stationery marker = markerFactory.createItem("Blue Marker", 2.20);


        ShoppingCart cart = new ShoppingCart();
        CommandInvoker invoker = new CommandInvoker();


        invoker.executeCommand(new AddItemCommand(cart, pen));
        invoker.executeCommand(new AddItemCommand(cart, notebook));
        invoker.executeCommand(new AddItemCommand(cart, marker));

        cart.showCart();

        System.out.println("\nUndoing last action:");
        invoker.undoLastCommand();
        cart.showCart();
    }
}
