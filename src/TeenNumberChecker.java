public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c) {
        if (isTeen(a)) {
            return true;
        } else if (isTeen(b)) {
            return true;
        } else return isTeen(c);
    }
    public static boolean isTeen (int d) {
        return 13 <= d && d <= 19;
    }
}
