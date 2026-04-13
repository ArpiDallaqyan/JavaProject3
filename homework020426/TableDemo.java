
package homework020426;

public class TableDemo {
    static void main(String[] args) {
        Table rectangleTable = new RectangleTable(4, "Wood",
                "Wood", 5,3.5);
        System.out.println("Area Of Rectangle Table: " + rectangleTable.getArea());

        LargeFoldingTable largeFoldingTable = new LargeFoldingTable(2, "Wood",
                "Wood", 3, 1.5, 0.5);
        System.out.println("Area Of Close Large Table: " + largeFoldingTable.getArea());
        System.out.println("Area Of Open Large Table: " + largeFoldingTable.getAreaOfLargeFoldingTable());

        Table squareTable = new SquareTable(4, "Plastic",
                "Plastic", 4.0);
        System.out.println("Area Of Square Table: " + squareTable.getArea());

        Table circleTable = new CircleTable(3, "Plastic",
                "Plastic", 2.5);
        System.out.println("Area Of Circle Table: " + circleTable.getArea());
    }
}
