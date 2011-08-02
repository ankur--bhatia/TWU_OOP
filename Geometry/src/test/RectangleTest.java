package test;

import Geometry.Rectangle;
import Geometry.Shape;
import junit.framework.Assert;
import org.junit.Test;

public class RectangleTest {

    private Shape rectangle;


    @Test
    public void testPerimeter()
    {
        rectangle = new Rectangle(10,12);
        Assert.assertEquals(44.0,rectangle.Perimeter());
    }

    @Test
    public void testCreateSquare()
    {
       Rectangle square =  Rectangle.CreateSquare(10);
       Assert.assertEquals(40.0, square.Perimeter());
    }


}
