
/*public class DecimalComparator {
    public  static boolean areEqualByThreeDecimalPlaces (double a, double b) {
     final double THRESHOLD = 0.0009;
        return Math.abs(a - b) < THRESHOLD;
    }
}*/
public class DecimalComparator {
    public  static boolean areEqualByThreeDecimalPlaces (double a, double b) {
        return (int) (a * 1000) == (int) (b * 1000);
    }
}
