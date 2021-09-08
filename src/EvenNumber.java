public class EvenNumber {
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }

    public static void evenNumber(int number, int finishNumber) {
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }
    }

    public static void sumEvenNumber(int number, int finishNumber) {
        int evenNumbersFound = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
           System.out.println("Even number " + number);
            evenNumbersFound++;
            if(evenNumbersFound == 5) {
                break;
            }
        }
        System.out.println("Total even number found = " + evenNumbersFound);
    }
}
