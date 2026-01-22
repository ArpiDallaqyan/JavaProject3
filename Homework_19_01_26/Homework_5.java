package Homework_19_01_26;

public class Homework_5 {
    static void main(String[] args) {
        int number = 2442;
        int original = number;
        int polindrom = 0;
        while (number > 0) {
            int digit = number % 10;
            polindrom = polindrom * 10 + digit;
            number = number/10;
        }
        if (original == polindrom) {
            System.out.println("Number Is Polindrom");

        } else {
            System.out.println("Number Is Not Polindrom");
        }
    }
}
