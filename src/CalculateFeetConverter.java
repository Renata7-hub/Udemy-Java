public class CalculateFeetConverter {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
            } else {
           // return calcFeetAndInchesToCentimeters(feet * 12 +inches);
            double centimeters = feet * 12 * 2.54;
            centimeters += inches*2.54;
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } else {
            return inches * 2.54;
        }
    }
}
