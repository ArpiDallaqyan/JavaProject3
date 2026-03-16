package Homework_15_03_26;

public class Human {
    String name;
    int age;
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
