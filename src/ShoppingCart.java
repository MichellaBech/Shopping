package src;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Item> itemList = new ArrayList<>();
    private double discount;

    public void addItem (Item item)
    {
        itemList.add(item);
    }

    public void removeItem (Item item)
    {
        itemList.remove(item);
    }

    public double getTotalPrice ()
    {
        double totalPrice = 0;
        for(Item item : itemList)
        {
          totalPrice += item.getPrice();
        }
        if (discount > 0) {
            return  totalPrice = totalPrice - discount;
        }
        return totalPrice;
    }

    public void getItems()
    {
        for (Item item : itemList)
        {
            System.out.println(item.getName());
        }
    }

    public double setDiscount(double discount)
    {
        return this.discount = discount;
    }
}
