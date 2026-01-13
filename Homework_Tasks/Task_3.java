package Homework_Tasks;

import java.util.Scanner;

public class Task_3 {
    static void main(String[] args) {
        //3-րդ խնդիր - Տպել գնորդի տարիքը, տոմսի սկզբնական և վերջնական արժեքը

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter Your Sit Number");
        int seatNumber = Scanner.nextInt();
        System.out.println("Enter Your Age");
        int age = Scanner.nextInt();
        int ticket = 0;
        switch (seatNumber) {
            case 1:
                ticket = 12000;
                break;
            case 2:
                ticket = 8000;
                break;
            case 3:
                ticket = 7000;
                break;
            default:
                System.out.println("Invalid seat number");
        }
                if (age >= 65 && ticket == 12000) {
                    System.out.println("discounted value Is " + (ticket - (ticket / 100 * 20)));
                    System.out.println("Original Value Is " + ticket);
                    System.out.println("Age Is " + age);
                } else if (age >= 65 && ticket == 8000) {
                    System.out.println("discounted value Is " + (ticket - (ticket / 100 * 20)));
                    System.out.println("Original Value Is " + ticket);
                    System.out.println("Age Is " + age);
                } else if (age >= 65 && ticket == 7000) {
                    System.out.println("discounted value Is " + (ticket - (ticket / 100 * 20)));
                    System.out.println("Original Value Is " + ticket);
                    System.out.println("Age Is " + age);
                } else
                    System.out.println("Original Value Is " + ticket);
                    System.out.println("Age Is " + age);
                }
        }

