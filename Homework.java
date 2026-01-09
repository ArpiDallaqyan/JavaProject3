public class Homework {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello Worlld 2");
        // Declared 3 variables
        int a = 7;
        int b = 5;
        int c = 3;
        // Find arithmetic mean
        double mean = (a + b + c) / 2f;
        System.out.println(" Arithmetic mean of a,b,c is " + mean);
        // Recive three-digit number
        int ThreeDigitNumber = ((a * 100) + (b * 10) + c);
        System.out.println(ThreeDigitNumber);
        //Decimal part of number
        double x = mean;
        double y = (mean - ((a + b + c) / 2));
        System.out.println(y);

        //Char and variable
        char m = '3';
        int number = m - '0';
        System.out.println(number);

        //(a+b)3
        int f = (a + b) * (a + b) * (a + b);
        System.out.println(f);

        // New Homeworkes
        System.out.println("New Homework");
        // Տպել թվերը հատ առ հատ
        int i = 5658;
        int number1 = i / 1000;
        int number2 = (i / 100) % 10;
        int number3 = (i / 10) % 10;
        int number4 = i % 10;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);

        // ++, --

        int aa = 5;
        int bb = 7;
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

        System.out.println("New Homework");
        //Ստուգել մառդու տարիքային միջակայքը
        int age = 23;
        if (age >= 18 && age <= 65)
            System.out.println("Alowed");
        else
            System.out.println("Not Alowed");


        // || /ԿԱՄ/ Օպերոտորի կիրառմամբ առաջադրանք

        boolean hasInvitation = false || true;
        boolean hasTicket = false || true;
        boolean hasInvitation1 = hasInvitation;
        if (hasTicket || hasInvitation1)
            System.out.println("You Can Enter The Event");
        else
            System.out.println("You Can't Enter The Event");

        // Ստուգել արդյոք 3 փոփոխականներից 2-ը դրական են

        int a1 = 5;
        int a2 = -7;
        int a3 = 0;
        if (a1 > 0 && a2 > 0 || a3>0)
            System.out.println("True");
            else
                System.out.println("False");

            //Bitwise OR |
         int v = 7;     //0111
         int w = 9;     //1001
         int j = v | w; //1111/2ական համակարգում/ = 15/10ական համակարգում/
         System.out.println(v);
        System.out.println(w);
        System.out.println(j);


        // Տպել Մեծագույն արժեքը

        int u = 19;
        int p = 76;
        if(u > p)
            System.out.println(u);
            else
                System.out.println(p);


            // Ուսանողի գնահատական
        int score = 86;
        if (score>=90 || score<=100)
            System.out.println("Excellent");
        else if (score>=70 || score<=100)
            System.out.println("Good");
        else if (score>=50 || score<=69)
            System.out.println("Average");
        else if (score>=0 || score<=49)
            System.out.println("Fail");

        // *7
         boolean b1 = true;
         boolean b2 = true;
         if(b1^b2)
             System.out.println("Different");
         else
             System.out.println("Same");


        boolean d1 = false;
        boolean d2 = true;
        if(d1^d2)
            System.out.println("Different");
        else
            System.out.println("Same");

        //*8

        int q = 8; //1000 0001
        if((q & 1) == 0) //& 1-ի  ստուգում է միայն վերջին բիթը 0-ն զույգ է,1-ը կենտ
            System.out.println("Even");
        else
            System.out.println("Odd");

        }
    }

