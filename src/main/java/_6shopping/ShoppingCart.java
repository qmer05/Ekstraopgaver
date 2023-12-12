package _6shopping;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private ArrayList<Item> itemList;

    public ShoppingCart() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        for (Item i : itemList) {
            if (item.equals(i))
                itemList.remove(item);
        }
    }

    public int getTotalPrice() {

        int totalPrice = 0;
        for (Item i : itemList) {
            if(i.getDiscount() > 0){
                totalPrice -= i.getDiscount();
            }
            totalPrice += i.getPrice();
        }
        return totalPrice;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Item i : itemList){
            sb.append(i).append("\n");
        }
        return sb.toString();
    }

    public ArrayList<Item> getItems(){
        return itemList;
    }
}
