public class Main {

    public static void main(String[] args) {

        SpeedConverter.printConversion(10.5);

        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        System.out.println(BarkingDog.shouldWakeUp(true, -1));

        System.out.println(LeapYear.isLeapYear(1900));

        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.174, 3.175));

        System.out.println(CalculateFeetConverter.calcFeetAndInchesToCentimeters(1,13));

        System.out.println(CalculateFeetConverter.calcFeetAndInchesToCentimeters(100));

        System.out.println(TimeDuration.getDurationString(1853));

        MinutesToYearsDaysCalculator.printYearsAndDays(525600);

        IntEqualityPrinter.printEqual(1,1,2);

        SwitchCase.howToUseSwitch(2);

        SwitchCase.switchWithChar('F');

        SwitchCase.switchMonths("JAnuaRy");

        SwitchCase.printDayOfTheWeek(3);

        DayOfWeekChallenge.printDayOfTheWeek(2);

        DayOfWeekChallenge.printDayOfTheWeek2(2);

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(11,2021));;

        System.out.println(NumberOfDaysInMonth.getDaysInMonth2(11,2021));

      ForCase.calculateInterest(2,8);

        int count = 0;
        for (int i = 10 ; i < 50; i++) {
            if(ForCase.isPrime(i)) {
                count++;
                System.out.println("Number" + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

        int count2 = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.println(i);
                count2 ++;
                if (count2 == 5) {
                    System.out.println(sum);
                    break;
                }
            }
        }

        System.out.println("Number is odd? " + SumOddRange.isOdd(19));
        System.out.println(SumOddRange.sumOdd(1,10));

        EvenNumber.sumEvenNumber(4,20);

        System.out.println("The sum of the digits in number = " + DigitSumChallenge.sumDigits(125));

        System.out.println("The number is Palindrome? " + NumberPalindrome.isPalindrome(-1221) );




    }
}
