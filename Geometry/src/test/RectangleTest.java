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
    public void testCalculatePerimeter()
    {
        Assert.assertEquals(44.0,rectangle.Perimeter());
    }

}
