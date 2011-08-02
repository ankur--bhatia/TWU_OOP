package test;

import Geometry.RoundToTwoDecimalPlaces;
import org.junit.Test;
import org.testng.Assert;

public class RoundToTwoDecimalPlacesTest {

    @Test
    public void testRoundOff() throws Exception {
        Assert.assertEquals(22.23, RoundToTwoDecimalPlaces.RoundOff(22.233,2));
        Assert.assertEquals(22.24, RoundToTwoDecimalPlaces.RoundOff(22.237,2));
    }
}
