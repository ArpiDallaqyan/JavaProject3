package Homework_04_03_26;

public class NewProduct {
    static void main(String[] args) {
        Product product1 = new Product("Pen", 1122, 150, 50);
        Product.setDiscountRate(25);
        product1.CountGeneralPrice();
        product1.PrintInformation();
        Product product2 = new Product("Notebook", 1123, 1900, 30);
        product2.CountGeneralPrice();
        product2.PrintInformation();
        Product product3 = new Product("Book", 1224, 3500, 5, 35);
        product3.CountGeneralPrice();
        product3.PrintInformation();

    }
}
