package Homework_11_02_2026;

public class ArrayNumbersCalculate {
    static void main(String[] args) {
        int n = 3;
        int m = 4;
        int[][] arr = new int [n][m];
        int sum = 0;
        int summOfFirstColumn = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i > 0) {
                break;
            }
            sum = 0;
            for (int j = 0; j < arr[i].length - 1; j++) {
                sum += arr[j][i];
                summOfFirstColumn = sum;
            }
            System.out.println(sum);
        }
        System.out.println(summOfFirstColumn);
        for (int i = 1; i <= arr[0].length; i++) {
            if (sum == summOfFirstColumn){
                System.out.println("Equal");
            }else {
                System.out.println("Not Equal");
                break;
            }
            sum  = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j == 3){
                    break;
                }

            }
        }


    }
}
