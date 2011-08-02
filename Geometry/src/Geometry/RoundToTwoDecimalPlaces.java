package Geometry;

public class RoundToTwoDecimalPlaces {

    public static double RoundOff(double value, int roundedOffTo) {
        double p = (double) Math.pow(10, roundedOffTo);
        value = value * p;
        float tmp = Math.round(value);
        return (double) tmp / p;
    }
}