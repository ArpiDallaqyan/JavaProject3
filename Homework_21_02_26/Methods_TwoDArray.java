package Homework_21_02_26;

public class Methods_TwoDArray {
    static void main(String[] args) {
        int[] inputArr = {4, -7, 6, -9};
        int[][] result = new int[inputArr.length][inputArr.length];
        incrementArraysNumbers(inputArr, result);
    }

    static void incrementArraysNumbers(int[] input, int[][] result) {
        for (int i = 0; i < input.length; i++) {
            result[0][i] = input[i];
            System.out.print(result[0][i] + " ");
            }
        System.out.println();
        for (int i = 1; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = result[i-1][j] + 1;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        }
            }




