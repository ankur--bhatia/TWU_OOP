package Geometry;

import java.util.HashMap;
import java.util.Map;

public class Measurement {

    private double value;
    private final int roundOff = 2;
    private Unit unit;
    private static Map<Unit, Double> conversionMapToFoot = initializeMap();

    private static Map<Unit, Double> initializeMap() {
        Map<Unit, Double> map = new HashMap<Unit, Double>();
        map.put(Unit.meter, 3.2);
        map.put(Unit.foot, 1.0);
        return map;
    }

    public Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Measurement Add(Measurement rhs) {
        double sumInFoot = value * ConversionFactorToFoot() + rhs.value * rhs.ConversionFactorToFoot();
        return new Measurement(RoundToTwoDecimalPlaces.RoundOff(sumInFoot, roundOff), Unit.foot);
    }

    private double ConversionFactorToFoot() {
        return conversionMapToFoot.get(unit);
    }


    public Measurement Multiply(double number) {
        return new Measurement(number * value, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Measurement)) {
            return false;
        }

        Measurement that = (Measurement) o;

        double lhs = RoundToTwoDecimalPlaces.RoundOff(that.value * that.ConversionFactorToFoot(), roundOff);
        double rhs = RoundToTwoDecimalPlaces.RoundOff(this.value * this.ConversionFactorToFoot(), roundOff);
        return Double.compare(lhs, rhs) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = value != +0.0d ? Double.doubleToLongBits(value) : 0L;
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Measurement{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
