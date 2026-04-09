
package homework020426;

public abstract class Table {
    private final int numberOfTablesLegs;
    private final String tablesLegsMaterial;
    private final String tablesMaterial;

    Table(int numberOfTablesLegs, String tablesLegsMaterial, String tablesMaterial){
        this.numberOfTablesLegs = numberOfTablesLegs;
        this.tablesLegsMaterial = tablesLegsMaterial;
        this.tablesMaterial = tablesMaterial;
    }
    public int getNumberOfTablesLegs() {
        return numberOfTablesLegs;
    }

    public String getTablesLegsMaterial() {
        return tablesLegsMaterial;
    }

    public String getTablesMaterial() {
        return tablesMaterial;
    }

    abstract public double getArea();
}
