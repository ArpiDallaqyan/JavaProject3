package homework020426.Homework_02_04_26;

public class CircleTable extends Table{
   private final double radius;
    CircleTable(int numberOfTablesLegs, String tablesLegsMaterial, String tablesMaterial, double radius){
        super(numberOfTablesLegs, tablesLegsMaterial, tablesMaterial);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 3.14 * (getRadius() * getRadius());
    }
}
