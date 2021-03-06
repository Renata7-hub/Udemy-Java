public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;

        while (Math.abs(number) > 0) {
           int remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number/10;
        }
        return temp == reverse;
    }
}
