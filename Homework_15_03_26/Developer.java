package Homework_15_03_26;

public class Developer extends  Employee {

    String programmingLanguage;
    Developer(String name, int salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        super.work();
        System.out.println(" Programming Language: " + programmingLanguage);
    }
}
