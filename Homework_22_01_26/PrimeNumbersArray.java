package Homework_22_01_26;

public class PrimeNumbersArray {
    static void main(String[] args) {
        int array [] = {4, 7, 9, 13, 15, 17, 31};
        int [] primeNumberArray = new int [array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            int count = 2;
            boolean isPrime = true;
            if (num <= 1) {
                continue;
            }
                if (num == 2 || num == 3){
                    isPrime = true;
                    primeNumberArray[index++] = num;
                    continue;
                }
            while(count <= num/2){
                if(num % count == 0){
                    isPrime = false;
                    break;
                }
                count++;

            }if (isPrime){
                primeNumberArray[index++] = num;

            }

        }
        for (int i = 0; i < index; i++) {
            System.out.println(primeNumberArray[i]);

        }
    }
}
