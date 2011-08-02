package test;

import Geometry.Rectangle;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void setUp() throws Exception {

        rectangle = new Rectangle(10,12);
    }

    @Test
    public void testCalculateArea()
    {
        Assert.assertEquals(120.0,rectangle.Area());
    }

    @Test
    public void testCalculatePerimeter()
    {
        Assert.assertEquals(44.0,rectangle.Perimeter());
    }

    @Test
    public void testCreateSquare()
    {
       Rectangle square =  Rectangle.CreateSquare(10);
       Assert.assertEquals(100.0, square.Area());
       Assert.assertEquals(40.0, square.Perimeter());
    }


}
