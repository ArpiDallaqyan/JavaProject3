package Homework_28_03_26;

public class Square extends Figure {
    private double a;

    Square(String color, String name, double a){
        super(color, name);
        this.a = a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public int calculatePerimeter(){
        return (int)(4 * a);
    }

    @Override
    public double calculateArea(){
        return a * a;
    }
}
