package Homework_28_03_26;

public class Square extends Figure {
    double a;

    Square(String color, String name, double a){
        super(color, name);
        this.a = a;
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
