package QA_Automation.Src.HomeWork_310326;

public class TableMain {
        public static void main(String[] args) {

            Table t1 = new SquareTable(4, "Wood", "Glass", 2);
            System.out.println("Square: " + t1.getArea());

            Table t2 = new RectangleTable(4, "Metal", "Wood", 2, 3);
            System.out.println("Rectangle: " + t2.getArea());

            Table t3 = new CircleTable(1, "Metal", "Glass", 1.5);
            System.out.println("Circle: " + t3.getArea());

            ExpandableRectangleTable t4 = new ExpandableRectangleTable(4, "Wood", "Wood", 2, 3, 2);

            System.out.println("Normal: " + t4.getArea());
            System.out.println("Expanded: " + t4.getExpandedArea());
        }
    }

abstract class Table {
    protected int legsCount;
    protected String legsMaterial;
    protected String surfaceMaterial;

    public Table(int legsCount, String legsMaterial, String surfaceMaterial) {
        this.legsCount = legsCount;
        this.legsMaterial = legsMaterial;
        this.surfaceMaterial = surfaceMaterial;
    }

    public abstract double getArea();

    public int getLegsCount() {
        return legsCount;
    }

    public String getLegsMaterial() {
        return legsMaterial;
    }

    public String getSurfaceMaterial() {
        return surfaceMaterial;
    }
}
class SquareTable extends Table {

    private double side;

    public SquareTable(int legs, String legsMat, String surfMat, double side) {
        super(legs, legsMat, surfMat);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}
class RectangleTable extends Table {

    protected double length;
    protected double width;

    public RectangleTable(int legs, String legsMat, String surfMat, double length, double width) {
        super(legs, legsMat, surfMat);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}
class CircleTable extends Table {

    private double radius;

    public CircleTable(int legs, String legsMat, String surfMat, double radius) {
        super(legs, legsMat, surfMat);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
class ExpandableRectangleTable extends RectangleTable {

    private double extraArea;

    public ExpandableRectangleTable(int legs, String legsMat, String surfMat, double length, double width, double extraArea) {
        super(legs, legsMat, surfMat, length, width);
        this.extraArea = extraArea;
    }

    public double getArea() {
        return super.getArea();
    }

    public double getExpandedArea() {
        return getArea() + extraArea;
    }

    public double getExtraArea() {
        return extraArea;
    }
}