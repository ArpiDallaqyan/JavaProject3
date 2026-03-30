package Homework_15_03_26;

public class Manager extends Employee {

    String teamSize;
    Manager(String name, int salary,String teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        super.work();
        System.out.println(" TeamSize: " + teamSize);
    }
}
