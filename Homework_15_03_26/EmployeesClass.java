package Homework_15_03_26;

public class EmployeesClass {
    static void main(String[] args) {
        Developer developer = new Developer("Ani", 300000, "Java");
        Manager manager = new Manager("Mane", 250000, "15 Employees");
        developer.work();
        manager.work();
    }
}
