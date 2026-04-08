package homework150326;

public class Teacher extends Human {
    String subject;

    Teacher(String name,  int age, String subject){
        super(name, age);
        this.subject = subject;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}
