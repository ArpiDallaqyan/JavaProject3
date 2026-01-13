package Homework_Tasks;

public class Task_1 {
    static void main(String[] args) {

        //1-ին խնդիր - Ըստ ամսվա համարի տպել ամսվա օրերը։
        int month = 11;
        int monthDay = 18;
        if (monthDay > 31 || monthDay < 1)
            System.out.println("Not A date");
        else if ((month == 2) & monthDay > 29) {
            System.out.println("Not Day Of February");
            System.exit(1);
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            case 2 -> System.out.println(28);
            case 4, 6, 9, 11 -> System.out.println(30);
            default -> System.out.println("Unkown Day");

        }
    }
}
