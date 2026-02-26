package Homework_25_02_26;

public class ClassHomework {
    static void main(String[] args) {
        Book book1 = new Book("Jany Eyre", "Charlotte Bronte", 1847);
        book1.displayInfo();
        Rectangle rectangle1 = new Rectangle(7 , 9);
        int area = rectangle1.area();
        int perimetr = rectangle1.perimetr();
        System.out.println(area + " " + perimetr);
        Student student1 = new Student("Anna", 18);
        int grade1 = student1.promote();
        System.out.println(grade1);

    }
}
