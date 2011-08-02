package Geometry;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double Perimeter() {
       return 2 * radius * 22 / 7;
    }
}
