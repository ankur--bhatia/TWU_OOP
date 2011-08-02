package test;

import Geometry.Measurement;
import Geometry.Unit;
import org.junit.Test;
import org.testng.Assert;

public class MeasurementTest {

    private Measurement measurement;

    @Test
    public void testAddOfMeasurementsWithSameUnits() throws Exception {

        measurement = new Measurement(10, Unit.meter);
        Measurement sum = measurement.Add(new Measurement(2, Unit.meter));
        Assert.assertEquals(sum, new Measurement(12, Unit.meter));
    }

    @Test
    public void testEquals() throws Exception {

        measurement = new Measurement(1, Unit.meter);

        Assert.assertNotSame(measurement, null);
        Assert.assertNotSame(measurement, new Object());
        Assert.assertNotSame(measurement, new Measurement(23,Unit.meter));
    }

    @Test
    public void testTimesOfMeasurement() throws Exception {

        measurement = new Measurement(10, Unit.meter);
        Measurement product = measurement.Multiply(2);
        Assert.assertEquals(product, new Measurement(20, Unit.meter));
    }
}
