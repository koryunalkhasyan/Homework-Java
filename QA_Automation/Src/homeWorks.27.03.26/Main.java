package QA_Automation.Src.HomeWork_270326;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Square("Red", 12);
        shapes[1] = new Triangle("Green", 6, 8, 10); // Սա ուղղանկյուն է
        shapes[2] = new Circle("Blue", 5);
        shapes[3] = new Trapezoid("White", 4, 10, 5, 5, 4);

        Shape maxPerimeterShape = shapes[0];

        for (int i = 0; i < shapes.length; i++) {
            Shape current = shapes[i];

            System.out.println("Type: " + current.getName() +
                    ", Color: " + current.getColor() +
                    ", Perimeter: " + current.getPerimeter());

            if (current.getPerimeter() > maxPerimeterShape.getPerimeter()) {
                maxPerimeterShape = current;
            }
        }

        System.out.println("Name: " + maxPerimeterShape.getName());
        System.out.println("Color: " + maxPerimeterShape.getColor());
        System.out.println("Max Perimeter: " + maxPerimeterShape.getPerimeter());
    }
}
abstract class Shape {
    private final String name;
    private final String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    public abstract int getPerimeter();
    public abstract double getArea();
}

class Square extends Shape {
    private final int side;

    public Square(String color, int side) {
        super("Square", color);
        this.side = side;
    }

    @Override
    public int getPerimeter() { return 4 * side; }

    @Override
    public double getArea() { return (double) side * side; }
}

class Triangle extends Shape {
    private final int a, b, c;
    private final boolean isRight;

    public Triangle(String color, int a, int b, int c) {
        super("Triangle", color);
        this.a = a;
        this.b = b;
        this.c = c;
        this.isRight = (a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a);
    }

    public boolean isRightTriangle() { return isRight; }

    @Override
    public int getPerimeter() { return a + b + c; }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

class Circle extends Shape {
    private final int radius;

    public Circle(String color, int radius) {
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * radius); }

    @Override
    public double getArea() {
        return Math.PI * radius * radius; }
}

class Trapezoid extends Shape {
    private final int a, b, c, d, h;

    public Trapezoid(String color, int a, int b, int c, int d, int h) {
        super("Trapezoid", color);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public int getPerimeter() { return a + b + c + d; }

    @Override
    public double getArea() { return ((a + b) / 2.0) * h; }
}