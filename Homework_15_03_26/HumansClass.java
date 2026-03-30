package Homework_15_03_26;

public class HumansClass {
    static void main(String[] args) {
        Student student = new Student("Anna", 20, 95);
        Teacher teacher = new Teacher("Diana", 35, "Chemistry");
        student.displayInfo();
        teacher.displayInfo();
    }
}
