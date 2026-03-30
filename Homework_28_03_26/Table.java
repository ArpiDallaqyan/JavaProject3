package Homework_28_03_26;

public class Table extends Figure {
    double a;
    double b;
    double c;
    double d;
    double h;

    Table(String color, String name, double a, double b, double c, double d, double h){
        super(color, name);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public int calculatePerimeter(){
        return (int)(a + b + c + d);
    }

    @Override
    public double calculateArea(){
        return ((a * b)/2) * h ;
    }
}
