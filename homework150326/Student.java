package homework150326;

public class Student extends Human {
    int grade;
    Student(String name, int age, int grade){
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }
}
