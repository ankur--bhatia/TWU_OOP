package Geometry;

public class Rectangle
{
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }


    public double Area()
    {
        return length * width;

    }

    public double Perimeter()
    {
        return 2 * length + 2 * width;

    }

    public static Rectangle CreateSquare(int length)
    {
        return new Rectangle(length,length);
    }





}
