package Homework150126;

public class Task_5 {
    static void main(String[] args) {
        int numbers[] = {15, 1, 3, -15, 4, -30, 45, 54, 75};
        int sum = 0;
        for (int indexOfNumbers = 0; indexOfNumbers < numbers.length; indexOfNumbers++) {
            if (indexOfNumbers == numbers[indexOfNumbers]) {
                continue;
            }
                System.out.println(numbers[indexOfNumbers]);
                sum += numbers[indexOfNumbers];
                if (sum > 100){
                    break;
                }
        }
            System.out.println("Summ of numbers is " + sum);
        }
    }


