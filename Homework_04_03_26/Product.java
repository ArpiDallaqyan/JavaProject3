package Homework_04_03_26;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private int price;
    private int discount1;
    static int discountRate;

    Product(String name, int id, int price, int quantity){
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.id = id;
        discountRate = 10;

    }
    Product(String name, int id, int price, int quantity, int discount1) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.id = id;
        discountRate += discount1;
    }
        public int getPrice() {
        return price;
    }

    public static int getDiscountRate() {
        return discountRate;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public static void setDiscountRate(int discountRate) {
        Product.discountRate = discountRate;
    }
int lastPrice;
    public int CountGeneralPrice(){
        lastPrice = price - ((price * (Product.discountRate) / 100));
        return lastPrice;
    }
    public void PrintInformation(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discountRate);
        System.out.println("Quantity: " + quantity);
        System.out.println("Last Price: " + lastPrice);
    }
}
