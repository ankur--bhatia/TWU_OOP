package Geometry;

public class Rectangle {
    private Measurement length;
    private Measurement width;

    public Rectangle(Measurement length, Measurement width) {
        this.length = length;
        this.width = width;
    }

    public Measurement Perimeter() {
        Measurement sumOfLength = length.Multiply(2);
        Measurement sumOfWidth = width.Multiply(2);
        return sumOfLength.Add(sumOfWidth);
    }


    public static Rectangle CreateSquare(Measurement length) {
        return new Rectangle(length, length);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Rectangle)) {
            return false;
        }

        Rectangle rectangle = (Rectangle) o;

        if (length != null ? !length.equals(rectangle.length) : rectangle.length != null) {
            return false;
        }
        if (width != null ? !width.equals(rectangle.width) : rectangle.width != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = length != null ? length.hashCode() : 0;
        result = 31 * result + (width != null ? width.hashCode() : 0);
        return result;
    }
}
