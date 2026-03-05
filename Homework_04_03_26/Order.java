package Homework_04_03_26;
// PAKAS - Պետք է կարողանանք ստեղծել պատվերներ դիֆոլթ առաքման ժամանակով, ինչպես նաև տալ մեր ուզած առաքման ժամանակ
public class Order {
   private int id;
    private String name;
    private int price;
    private int time;
    static int totalOrders;
    static int shippingAmount;

    Order(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
        totalOrders ++;
        shippingAmount = 500;

    }

    Order(){
    }

    public int SumGeneralPrice(){
        int sumGeneralPrice = price + shippingAmount;
        return sumGeneralPrice;
    }

    public void PrintInformation(){
        System.out.println("ID Number Of Order Is " + id);
        System.out.println("Name Of Customer Is " + name);
        System.out.println("General price Of Order Is " + SumGeneralPrice());
        System.out.println("Total Number Of Orders Is " + totalOrders);

    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
