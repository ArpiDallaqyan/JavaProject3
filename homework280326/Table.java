package homework280326;

public class Table extends Figure {
    private double a;
    private double b;
    private double c;
    private double d;
    private double h;

    Table(String color, String name, double a, double b, double c, double d, double h){
        super(color, name);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
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

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
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
