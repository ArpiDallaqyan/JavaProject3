package Homework150126;

import java.util.Scanner;

public class Task_8 {
    static void main(String[] args) {
        int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner Scanner = new Scanner(System.in);
        while(true){
        System.out.println("Enter Number Of Month");
        int month = Scanner.nextInt();
        if (month<=0 || month >12){
            System.out.println("Wrong Number Of Month");
            continue;
        }
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
                case 2 -> System.out.println(28);
                case 4, 6, 9, 11 -> System.out.println(30);
                default -> System.out.println("Unkown Day");
            }
        break;

    }
    }
}

