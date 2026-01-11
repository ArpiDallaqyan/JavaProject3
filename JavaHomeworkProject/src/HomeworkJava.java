public class HomeworkJava {
    static void main(String[] args) {
        // Declared 3 variables
        int a = 7;
        int b = 5;
        int c = 3;
        // Find arithmetic mean
        double mean = (a + b + c)/2f;
        System.out.println(" Arithmetic mean of a,b,c is "+ mean);
        // Recive three-digit number
        int ThreeDigitNumber = ((a*100) + (b*10) + c);
        System.out.println(ThreeDigitNumber);
        //Decimal part of number
        double x = mean;
        double y = (mean - ((a+b+c)/2));
        System.out.println(y);

        //Char and variable
        char m = '3';
        int number = m - '0';
        System.out.println(number);

        //(a+b)3
        int f = (a+b)*(a+b)*(a+b);
        System.out.println(f);
    }
}

