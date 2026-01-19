package Homework_17_01_26;
// Գտնել array-ի վերջին բացասական թիվը։ Տպել թիվն ու դրա ինդեքսը,
// եթե էդպիսի թիվ չկա տպել համապատասխան հաղորդագրություն
public class Task_3 {
    static void main(String[] args) {
         int[] array = {1, 5, 24, -8, 15, -6, 32, 18};
        for (int index = array.length-1; index <= array.length - 1; index--) {
          if (array[index] - 1 > 0){
            continue;
        }
        if (array[index] < 0) {
          System.out.println("Last Negative Number Is " + array[index]);
        System.out.println("Last Negative Number's Index Is " + index);
        }
        else System.out.println("No Negative Number");
        break;

              }

    }
}

