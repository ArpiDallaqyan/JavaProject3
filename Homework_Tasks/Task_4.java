package Homework_Tasks;

import java.util.Scanner;

public class Task_4 {
    static void main(String[] args) {
        // 3-րդ խնդիր - Տրանսպորտային համակարգ և դրանից օգտվելու զեղչեր
        // a - եթե տարիքը մեծ է 65 և փոքր 18-ից զեղչ 20%
        int price = 2000;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age1 = Scanner.nextInt();
        if (age1 > 65 || age1 < 18)
            System.out.println("Discounted Value Is " + (price - (price / 100 * 20))); //Զեղչված Արժեք
        else System.out.println("Original Price Is " + price); //Օրիգինալ Արժեք
        // b - եթե ունի 3 երեխա - 15%, 4 երեխա - 25%, 5 երեխա - 35%, 5+ երեխա - 50%
        System.out.println("Enter Your Age");
        int age2 = Scanner.nextInt();
        System.out.println("Enter Your Number Of Children");
        int children = Scanner.nextInt();
        int price1 = 3000;
        if ((age2 > 18 || age2 < 65) && children == 3) {
            System.out.println("Original Price Is " + price1); //Օրիգինալ Գին
            System.out.println("Discount Amount Is " + (price1 / 100 * 15)); //Զեղչի Չափ
            System.out.println("Discounted Value Is " + (price1 - (price1 / 100 * 15))); //Զեղչված Արժեք
        } else if ((age2 > 18 || age2 < 65) && children == 4) {
            System.out.println("Original Price Is " + price1); //Օրիգինալ Գին
            System.out.println("Discount Amount Is " + (price1 / 100 * 25)); // Զեղչի Չափ
            System.out.println("Discounted Value Is " + (price1 - (price1 / 100 * 25))); // Զեղչված Արժեք
        } else if ((age2 > 18 || age2 < 65) && children == 5) {
            System.out.println("Original Price Is " + price1); //Օրիգինալ Գին
            System.out.println("Discount Amount Is " + (price1 / 100 * 35)); //Զեղչի Չափ
            System.out.println("Discounted Value Is " + (price1 - (price1 / 100 * 35))); //Զեղչված Արժեք
        } else if ((age2 > 18 || age2 < 65) && children >5) {
            System.out.println("Original Price Is " + price1); //Օրիգինալ Գին
            System.out.println("Discount Amount Is " + (price1 / 100 * 50)); //Զեղչի Չափ
            System.out.println("Discounted Value Is " + (price1 - (price1 / 100 * 50))); //Զեղչված Արժեք
        }
    }
}


