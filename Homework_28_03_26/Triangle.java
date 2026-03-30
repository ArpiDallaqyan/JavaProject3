package Homework_28_03_26;

public class Triangle extends Figure {

    double a;
    double b;
    double c;
    double h;

    Triangle(String color, String name, double a, double b, double c){
        super(color, name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int calculatePerimeter(){
        return (int) (a + b + c);
    }

    @Override
    public double calculateArea(){
        double p = (a * b * c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public boolean isRightTriangle() {
        if (c * c == (b * b) + (a * a)) {
            System.out.println("The Triangle Is Right");
        }
        return true;
    }
}
