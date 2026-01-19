package Homework150126;

public class Task_7 {
    static void main(String[] args) {
        int[] a = {-5, -7, 1, 3, 5, 7, 9, 15, 19, 18, 21};
        boolean opposit = true;
        for (int index = 0; index < a.length - 1; index++) {
            if (a[index] < 0) {
                continue;
            }
            if (a[index] >= a[index + 1]){
                opposit = false;
                System.out.println(index);
                break;
            }
        } if(opposit){
            System.out.println("OK");
        }
            }
        }


