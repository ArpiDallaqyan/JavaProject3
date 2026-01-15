package Homework150126;

public class Task_6 {
    static void main(String[] args) {
        int[] number = {7, 9, -4, 9, 13, 15, 24, 5, 32};
        boolean opposite = false;
        for (int indexOfNumber = 1; indexOfNumber < 8; indexOfNumber++) {
            int prev = number[indexOfNumber - 1];
            int next = number[indexOfNumber + 1];
            if (prev == next) {
                System.out.println("When Index Is " + indexOfNumber + " Numbers Are Equal");
             opposite = true;
                break; }
            if (opposite = false){
                System.out.println("No Mirror Index");
            }
            }
        }
    }
