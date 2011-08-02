package test;

import Geometry.Measurement;
import Geometry.Rectangle;
import Geometry.Unit;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void setUp() throws Exception {

        rectangle = new Rectangle(new Measurement(10, Unit.meter), new Measurement(12, Unit.meter));
    }

    @Test
    public void testCalculatePerimeter() {
        Assert.assertEquals(new Measurement(44, Unit.meter), rectangle.Perimeter());
    }

    @Test
    public void testCreateSquare() {
        Rectangle square = new Rectangle(new Measurement(10, Unit.foot), new Measurement(10, Unit.foot));
        Assert.assertEquals(square, Rectangle.CreateSquare(new Measurement(10, Unit.foot)));
    }
}
