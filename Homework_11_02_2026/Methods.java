package Homework_11_02_2026;

public class Methods {
    static void main(String[] args) {
        int salary = 90000;
        calculateIncomeTax(salary);
    }

    static int calculateIncomeTax(int salary) {
        int tax = 0 ;
        if (salary <= 150000){
            tax = calculateTax((int) salary);
            printSalaryAndTax(salary, tax);
        }
        else if (salary > 150000 && salary <= 500000){
            tax = calculateTax(((float) salary));
            printSalaryAndTax(salary, tax);
        } else if (salary > 500000) {
            tax = calculateTax((double) salary);
            printSalaryAndTax(salary, tax);
        }
        return tax;
    }
    static int calculateTax(int salary) {
        int tax = salary * 15 / 100;
        return tax;
    }
    static int calculateTax(float salary) {
        int tax = 0;
        tax = (int) salary * 20 / 100;
        return tax;
    }
    static int calculateTax(double salary){
        int tax = 0;
        tax = (int) salary / 1000 * 300;
        return tax;
    }

    static void printSalaryAndTax(int salary, int tax){
        System.out.println("Salary Is " + salary + " " + "Tax Is " + tax);
    }



}
