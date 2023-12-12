package _6shopping;

public class Main {

    public static void main (String [] args){
        Item apple = new Item("Æble",2);
        Item pineapple = new Item("Ananas",18);
        Item watermelon = new Item("Vandmelon", 32);
        Item banana = new Item("Banan", 3);

        ShoppingCart sc = new ShoppingCart();
        sc.addItem(apple);
        sc.addItem(pineapple);
        sc.addItem(watermelon);
        watermelon.setDiscount(20);
        sc.addItem(banana);
        System.out.println(sc);
        System.out.println("Discount on watermelon: " + watermelon.getDiscount());
        System.out.println("Samlet pris for varerne: " + sc.getTotalPrice());

        sc.removeItem(watermelon);
        System.out.println(sc);
        System.out.println("Samlet pris for varerne efter en vare er fjernet: "+ sc.getTotalPrice());

        System.out.println(sc.getItems());


    }

}
