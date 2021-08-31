public class Main {

    public static void main(String[] args) {

        SpeedConverter.printConversion(10.5);

        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        System.out.println(BarkingDog.shouldWakeUp(true, -1));

        System.out.println(LeapYear.isLeapYear(1900));

        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.174, 3.175));


    }
}
