package Homework_28_03_26;

public class Circle extends Figure {
    double r;

    Circle(String color, String name, double r){
        super(color, name);
        this.r = r;
    }

    @Override
    public int calculatePerimeter(){
        return (int)(r * 3.14159);
    }

    @Override
    public double calculateArea(){
        return (3.14159 * (r * r));
    }

}
