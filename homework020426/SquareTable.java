package homework020426;

public class SquareTable extends Table{
    private final double side;
    SquareTable(int numberOfTablesLegs, String tablesLegsMaterial, String tablesMaterial, double side){
        super(numberOfTablesLegs, tablesLegsMaterial, tablesMaterial);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }
}
