package Homework_25_02_26;

class Student {
    String name;
    int age;
    int grade;

    Student(String n, int a, int g){
        name = n;
        age = a;
        grade = g;
    }
    Student(String n, int a){
        name = n;
        age = a;
    }
    int promote(){
        int grade = 0;
        grade++;
        return grade;

    }
}
