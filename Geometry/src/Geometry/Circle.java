package Geometry;

public class Circle extends Shape{

    private Measurement radius;

    public Circle(Measurement radius) {
        this.radius = radius;
    }

    @Override
    public Measurement Perimeter() {
       return radius.Multiply(3.14).Multiply(2);
    }
}
