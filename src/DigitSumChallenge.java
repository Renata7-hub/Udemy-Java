public class DigitSumChallenge {
    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int digit;
        int sum = 0;
        //
        while (number > 0){
            //extract the lest-significant digit
                digit = number % 10;
                sum+=digit;
           // number = number/10; drop t he leat-significant digit
            number/=10;
            }
        return sum;

    }
}
