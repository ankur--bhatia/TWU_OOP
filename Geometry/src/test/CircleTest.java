package test;

import Geometry.Circle;
import Geometry.Shape;
import junit.framework.Assert;
import org.junit.Test;


public class CircleTest {

    private Shape circle;

    @Test
    public void testPerimeter() throws Exception {
        circle = new Circle(7);
        Assert.assertEquals(44.0, circle.Perimeter());
    }
}
