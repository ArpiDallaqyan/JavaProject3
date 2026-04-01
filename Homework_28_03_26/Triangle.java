package Homework_28_03_26;

public class Triangle extends Figure {

    private double a;
    private double b;
    private double c;
    private double h;

    Triangle(String color, String name, double a, double b, double c){
        super(color, name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
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
