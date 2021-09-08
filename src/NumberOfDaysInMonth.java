public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if(year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

  public static int getDaysInMonth(int month, int year) {

      if (month < 1 || month >12 || year < 1 || year >9999) {
          return  -1;
      }
 int daysNumber;
      switch (month) {
            case 1:  case 3: case 5: case 7: case 8: case 10: case 12:
                daysNumber = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    daysNumber = 29;
                } else {
                    daysNumber = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
              daysNumber = 30;
              break;
            default:
                daysNumber = -1;
                break;
        }
        return daysNumber;
    }



    public static int getDaysInMonth2(int month,  int year) {
        if (month < 1 || month >12 || year < 1 || year >9999) {
            return -1;
        } else if (month == 1 || month == 3 || month == 5 || month ==7|| month == 8 || month == 10 || month == 12){
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
    }
}
