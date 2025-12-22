public class Homework {
        public static void main(String[] args) {
            System.out.println("Hello World");
            System.out.println("Hello Worlld 2");
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

        // New Homeworkes
            System.out.println("New Homework");
            // Տպել թվերը հատ առ հատ
            int i = 5658 ;
            int number1 = i/1000;
            int number2 = (i / 100) % 10;
            int number3 = (i / 10) % 10;
            int number4 = i % 10 ;
            System.out.println(number1);
            System.out.println(number2);
            System.out.println(number3);
            System.out.println(number4);

            // ++, --

            int aa = 5 ;
            int bb = 7 ;
            int cc = aa++;
            int dd = bb++;
            System.out.println("aa is" + " " + aa);
            System.out.println("bb is" + " " + bb);
            System.out.println("cc is" + " " + cc);
            System.out.println("dd is" + " " + dd);
            int ee = cc--;
            int ff = dd--;
            System.out.println("ee is" + " " + ee);
            System.out.println("ff is" + " " + ff);
            System.out.println("cc is" + " " + cc);
            System.out.println("dd is" + " " + dd);

            //Փոփոխականների բազմապատկում, որ արդյունքում ստանանք ճիշտ արդյունք

            int k = 45625641;
            int s = 1545;
            long num = (long) k * s;
            System.out.println(num);

        }
    }
