package _6shopping;

public class Item {
    private String name;
    private int price;
    private int discount;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void setDiscount(int discount){
        this.discount = discount;
    }

    public int getDiscount(){
        return discount;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString(){
        return "Vare: " + name + " Pris: " + price;
    }

}
