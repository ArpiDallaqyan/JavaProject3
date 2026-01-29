package Homework_29_01_26;

public class Matrix {
    static void main(String[] args) {
        int[][] arr = {
                {1, 4, 8, 9},  //0-0,0-1,0-2,0-3
                {5, 6, 9, 8},  //1-0,1-1,1-2,1-3
                {7, 5, 3, 9},  //2-0,2-1,2-2,2-3
                {2, 4, 1, 7},  //3-0,3-1,3-2,3-3
        };
        int number = 0;
        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                number = arr[j][i];
                System.out.print(number + " ");

            }System.out.println();
        }

    }
}
