package homework190526.gen;

public class House implements Comparable<House> {
    private double area;
    House(double area){
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    public int compareTo(House other) {
        return Double.compare(this.area, other.area);
    }
}

