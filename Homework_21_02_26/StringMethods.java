package Homework_21_02_26;

public class StringMethods {
    static void main(String[] args) {
        String s = "dnjdkfbkjdf";
        char ch = 'j';
        char ch1 = 'b';
        cutString(s, ch);
        cutString(s, ch, ch1);
    }
    static String cutString(String s, char ch) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                System.out.println(s.substring((i)));
            } else if (s.charAt(i) == 0) {
                System.out.println("There Is Not This Char");
                return " ";
            }
        }
        return s;
    }

    static String cutString(String s, char ch, char ch1) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                start = s.indexOf(ch) ;
            }

        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch1) {
                end = s.indexOf(ch1);
            }

        }
        if (start == 0 || end == -1 || start >= end){
            System.out.println("There Is Not This Char");
            return " ";
        }
        System.out.println(s.substring(start, end));
        return s;
    }
}

