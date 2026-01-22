package Homework_19_01_26;

public class Homework_6 {
    static void main(String[] args) {
        int number = 4521;
        int sum1 = number;
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int digit = 0;
        int summOfDigits = 0;
        for (int i = 0; i < 3; i++) {
            if (number > 0) {
                digit = number % 10;
                number = number / 10;
                number1 = digit;
            }
            if (number > 0) {
                digit = number % 10;
                number = number / 10;
                number2 = digit;
                if (number > 0) {
                    digit = number % 10;
                    number = number / 10;
                    number3 = digit;
                    if (number > 0) {
                        digit = number % 10;
                        number = number / 10;
                        number4 = digit;

                    }
                } summOfDigits = number1 + number2 + number3 + number4;
                System.out.println("Summ Of Digits Is " + (summOfDigits));
                System.out.println("Summ Of Number And Digits Is " + (sum1 + summOfDigits));
            }
        }
    }
}
