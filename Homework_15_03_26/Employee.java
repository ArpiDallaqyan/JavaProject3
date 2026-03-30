package Homework_15_03_26;

public class Employee {
    String name;
    int salary;

    Employee(String name, int salary){
        this.name = name;
        this. salary = salary;
    }

    public void work(){
        System.out.print("Name: " + name + " " + "Salary: " + salary);
    }
}
