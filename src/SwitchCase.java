import java.util.Locale;

public class SwitchCase {

    public static void howToUseSwitch(int switchValue) {
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break; //jei turimas tinkamas cas po break vykdo toliau  uz switch metodo, jei nera break- dvykdys sekanti case -KLAIDA!!

            case 2:
                System.out.println("Value was 2");
                break;

            default: // other cases
                System.out.println("Value was not 1 and not 2");
                break;
        }
    }

    public static void switchWithChar(char charValue) {

        switch (charValue) {
            case 'A':
                System.out.println("Char A is found");
                break;

            case 'B':
                System.out.println("Char B is found");
                break;

            case 'C':
                System.out.println("Char C is found");
                break;

            case 'D':
                System.out.println("Char D id found");
                break;
            case 'E':
            case 'G':
                System.out.println(charValue + " was found");
                break;

            default:
                System.out.println("Char not found");
                break;
        }
    }

    public static void switchMonths(String month) {
        switch (month.toLowerCase()) {   //or use toUpperCase() -when change case to "JANUARY" and "JUNE"
            case "january":
                System.out.println("JAN");
                break;

            case "june":
                System.out.println("JUN");
                break;

            default:
                System.out.println("Not sure");
                break;
        }
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }


}
