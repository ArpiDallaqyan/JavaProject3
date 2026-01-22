package Homework_19_01_26;

public class Homework_4 {
    static void main(String[] args) {
        int[] arr = {1, 5, 4, 7, 6};
        int arr0 = 0;
        int arr1 = 0;
        int arr2 = 0;
        int arr3 = 0;
        int arr4 = 0;
        for (int indexOfNumber = 0; indexOfNumber <= arr.length - 1; indexOfNumber++) {
            if (arr[indexOfNumber] < arr.length) {
                arr0 = arr[0];
                arr1 = arr[1];
                arr2 = arr[2];
                arr3 = arr[3];
                arr4 = arr[4];

            }
            System.out.println(arr[indexOfNumber]);
        }
        int number = (arr0 * 10000) + (arr1 * 1000) + (arr2 * 100) + (arr3 * 10) + (arr4);
        System.out.println(number);
    }
}
