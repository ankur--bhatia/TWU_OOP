package test;

import Geometry.Circle;
import Geometry.Measurement;
import Geometry.Shape;
import Geometry.Unit;
import junit.framework.Assert;
import org.junit.Test;


public class CircleTest {

    private Shape circle;

    @Test
    public void testPerimeter() throws Exception {
        circle = new Circle(new Measurement(7, Unit.meter));
        Assert.assertEquals(new Measurement(43.96,Unit.meter), circle.Perimeter());
    }
}
