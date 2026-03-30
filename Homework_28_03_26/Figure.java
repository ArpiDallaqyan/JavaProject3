package Homework_28_03_26;

public class Figure {
   private String color;
   private String name;
   int perimeter;
   double area;

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    Figure(String color, String name){
       this.color = color;
       this.name = name;

    }
    public double calculateArea(){
        return -1.0;
    }

    public int calculatePerimeter(){
        return -1;

    }
    public boolean isRightTriangle() {
        return false;

    }
}
