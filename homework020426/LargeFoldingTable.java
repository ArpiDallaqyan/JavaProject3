package homework020426.Homework_02_04_26;

public class LargeFoldingTable extends RectangleTable {

    private final double areaOfLargeTable;

    LargeFoldingTable(int numberOfTablesLegs, String tablesLegsMaterial,
                      String tablesMaterial, double length, double width, double areaOfLargeTable){
        super(numberOfTablesLegs, tablesLegsMaterial, tablesMaterial, length, width);
        this.areaOfLargeTable = areaOfLargeTable;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    public double getAreaOfLargeFoldingTable(){
        return super.getArea() + areaOfLargeTable;

    }
}
