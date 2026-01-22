package Homework_19_01_26;

public class Homework_2 {
    static void main(String[] args) {
        int [] array1 = {1,2,3,4};
        int [] array2 = new int [4];
        for (int index = 0; index <= array1.length -1 ; index++) {
            if (array1[index] > array2[index]){
                array2[index] = -array1[index];
                System.out.println(array2[index]);
            }

        }
    }
}
