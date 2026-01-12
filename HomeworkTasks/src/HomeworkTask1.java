public class HomeworkTask1 {
    static void main(String[] args) {
        System.out.println("Homework");
        //1-ին խնդիր - Ըստ ամսվա համարի տպել ամսվա օրերը։
        int month = 11;
        int monthDay = 18;
        if (monthDay > 31 || monthDay < 1)
            System.out.println("Not A date");
        else if ((month == 2) & monthDay > 29) {
            System.out.println("Not Day Of February");
            System.exit(1);
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            case 2 -> System.out.println(28);
            case 4, 6, 9, 11 -> System.out.println(30);
            default -> System.out.println("Unkown Day");

        }
        //2-րդ խնդիր - Ըստ ամսվա համարի տպել ամսվա օրերը օգտագործելով Array-ներ
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("June has " + monthDays[7]);

        //2-րդ խնդրի երկրորդ տարբերակ
        int[] month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("December has " + month_days[11]);

        //3-րդ խնդիր - Տպել գնորդի տարիքը, տոմսի սկզբնական և վերջնական արժեքը

        int ticket = 8000;
        int age = 65;
        if (age >= 65 && ticket == 7000) {
            System.out.println("discounted value Is " + (ticket - (ticket / 100 * 20)));
            System.out.println("Original Value Is " + ticket);
            System.out.println("Age Is " + age);
        } else if (age >= 65 && ticket == 8000) {
            System.out.println("discounted value Is " + (ticket - (ticket / 100 * 20)));
            System.out.println("Original Value Is " + ticket);
            System.out.println("Age Is " + age);
        } else if (age >= 65 && ticket == 12000) {
            System.out.println("discounted value Is " + (ticket - (ticket / 100 * 20)));
            System.out.println("Original Value Is " + ticket);
            System.out.println("Age Is " + age);
        } else if (age < 65 || age > 0) {
            System.out.println("Original Value Is " + ticket);
            System.out.println("Age Is " + age);
        }

        // 3-րդ խնդիր - Տրանսպորտային համակարգ և դրանից օգտվելու զեղչեր
        // a - եթե տարիքը մեծ է 65 և փոքր 18-ից զեղչ 20%
        int age1 = 75;
        int price = 2000;
        if (age1 > 65 || age1 < 18)
            System.out.println("Discounted Value Is " + (price - (price / 100 * 20))); //Զեղչված Արժեք
        else System.out.println("Original Price Is " + price); //Օրիգինալ Արժեք

        // b - եթե ունի 3 երեխա - 15%, 4 երեխա - 25%, 5 երեխա - 35%, 5+ երեխա - 50%
        int age2 = 25;
        int children = 3;
        int price1 = 3000;
        if ((age2 > 18 || age2 < 65) && children == 3) {
            System.out.println("Original Price Is " + price1); //Օրիգինալ Գին
            System.out.println("Discount Amount Is " + (price1 / 100 * 15)); //Զեղչի Չափ
            System.out.println("Discounted Value Is " + (price1 - (price1 / 100 * 15))); //Զեղչված Արժեք
        } else if ((age2 > 18 || age2 < 65) && children == 4) {
            System.out.println("Original Price Is " + price1); //Օրիգինալ Գին
            System.out.println("Discount Amount Is " + (price1 / 100 * 25)); // Զեղչի Չափ
            System.out.println("Discounted Value Is " + (price1 - (price1 / 100 * 25))); // Զեղչված Արժեք
        } else if ((age2 > 18 || age2 < 65) && children == 5) {
            System.out.println("Original Price Is " + price1); //Օրիգինալ Գին
            System.out.println("Discount Amount Is " + (price1 / 100 * 35)); //Զեղչի Չափ
            System.out.println("Discounted Value Is " + (price1 - (price1 / 100 * 35))); //Զեղչված Արժեք
        } else if ((age2 > 18 || age2 < 65) && children >5) {
            System.out.println("Original Price Is " + price1); //Օրիգինալ Գին
            System.out.println("Discount Amount Is " + (price1 / 100 * 50)); //Զեղչի Չափ
            System.out.println("Discounted Value Is " + (price1 - (price1 / 100 * 50))); //Զեղչված Արժեք
        }
    }
}


