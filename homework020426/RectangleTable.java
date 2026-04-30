package homework020426;

import homework020426.Table;

public class RectangleTable extends Table {
   private final double length;
    private final double width;

    RectangleTable(int numberOfTablesLegs, String tablesLegsMaterial, String tablesMaterial, double length, double width){
        super(numberOfTablesLegs, tablesLegsMaterial, tablesMaterial);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return (getLength()) * (getWidth());
    }
}
