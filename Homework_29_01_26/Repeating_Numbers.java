package Homework_29_01_26;

public class Repeating_Numbers {
    static void main(String[] args) {
        int[] arr = {1, 5, 7, 5, 5, 5, 6, 4, 3, 2, 15, 7, 6, 6, 5, 4};
        boolean [] checked = new boolean[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 1;
            if (checked[i]){
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    checked[j] = true;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }
}
