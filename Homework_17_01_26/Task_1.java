package Homework_17_01_26;
//Գտնել ամբողջ թվերի array-ի մեջի 2-րդ ամենամեծ թիվը

public class Task_1 {
    static void main(String[] args) {
        int[] array = {1, 2, 15, 7, 27, 9, 38, 11};
        int maxNumber = array[0];
        int prevMaxNumber2 = array[0];
        for (int num : array) {
            if (num > maxNumber){
                prevMaxNumber2 = maxNumber;
                maxNumber = num;
            }
        }
        System.out.println(prevMaxNumber2);


    }

}

