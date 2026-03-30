package Homework_28_03_26;

public class GeometricFigure {
    static void main(String[] args) {
        Figure square = new Square("Red", "Square", 5.5);
        System.out.println("Area Of Square: " + square.calculateArea());
        System.out.println("Perimeter Of square: " + square.calculatePerimeter());

        Figure triangle = new Triangle("Green", "Triangle",7.2, 5.4, 9.5 );
        System.out.println("Area Of Triangle: " + triangle.calculateArea());
        System.out.println("Perimeter Of Triangle: " + triangle.calculatePerimeter());
        System.out.println("Is Right Triangle: " + triangle.isRightTriangle());

        Figure circle = new Circle("Yelow", "Circle", 7.7);
        System.out.println("Area Of Circle: " + circle.calculateArea());
        System.out.println("Perimeter Of Circle: " + circle.calculatePerimeter());

        Figure table = new Table("Blue", "Table", 3.5, 7.5, 3.5, 7.5, 9);
        System.out.println("Area Of Circle: " + circle.calculateArea());
        System.out.println("Perimeter Of Circle: " + circle.calculatePerimeter());

        Figure [] figures = {new Square("Black" , "Square", 9.2),
                new Triangle("White", "Triangle", 5.0, 7.5,4.6 ),
                new Circle("Green", "Circle", 8.5),
                new Table("Dark", "Table", 15.0,6.6,15.0,6.6,12)};
        double maxPerimeter = figures[0].calculatePerimeter();
        for (int i = 1; i < figures.length; i++) {
            if (figures[i].calculatePerimeter() > maxPerimeter){
                maxPerimeter = figures[i].calculatePerimeter();
                System.out.println(figures[i].getName());
                System.out.println(figures[i].calculatePerimeter());
            }
        }
    }
}
