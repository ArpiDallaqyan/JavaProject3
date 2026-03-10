package Homework_04_03_26;

public class OnlineOrders {
    static void main(String[] args) {
        Order Order1 = new Order(1111, "Anna", 6000);
        Order Order2 = new Order(1112, "Ani", 12000);
        Order Order3 = new Order(1113, "Milena", 7000);
        Order Order4 = new Order(1114, "Elena", 15000);
        Order1.SumGeneralPrice();
        Order2.PrintInformation();
        Order3.PrintInformation();
        Order1.getTime();
        Order2.setTime(25);
        System.out.println("Time Is " + Order1.getTime());
        System.out.println("Time Is " + Order2.getTime());
    }
}