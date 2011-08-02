package Geometry;

public class Measurement {

    private double value;
    private final int roundOff = 2;
    private Unit unit;


    public Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Measurement Add(Measurement rhs) {
        return new Measurement(RoundToTwoDecimalPlaces.RoundOff(value  + rhs.value, roundOff), unit);
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

        double lhs = RoundToTwoDecimalPlaces.RoundOff(that.value, roundOff);
        double rhs = RoundToTwoDecimalPlaces.RoundOff(this.value, roundOff);
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
