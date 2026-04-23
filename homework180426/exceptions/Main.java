package homework180426.exceptions;

public class Main {
    static void main(String[] args) {
        String string = new String("bdhdfh");
        String string2 = new String("1256");

        try {
            int num = Integer.parseInt(string);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("This string can't be a number");
        }

        try {
            int num = Integer.parseInt(string2);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("This string can't be a number");
        }

    }
}
