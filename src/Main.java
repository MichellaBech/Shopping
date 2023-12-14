package src;

public class Main {

    public static void main(String[] args) {

        Item apple = new Item("Apple", 5);
        Item orange = new Item("Orange", 6);
        Item banana = new Item("Banana", 3);

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(apple);
        shoppingCart.addItem(orange);
        shoppingCart.addItem(banana);

        System.out.println(shoppingCart.getTotalPrice());

        shoppingCart.removeItem(orange);

        System.out.println(shoppingCart.getTotalPrice());
        shoppingCart.getItems();

        shoppingCart.setDiscount(2);
        System.out.println(shoppingCart.getTotalPrice());
    }
}
