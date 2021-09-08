public class ForCase {
    public static void calculateInterest(int initial, int terminate) {
        for (int i = terminate; i > initial - 1; i--) {
            System.out.println(10000 * i / 100);
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

      //  for (int i = 2; i <= n / 2; i++) { --neoptimalus variantas, sekanciame greiciau paskaiciuos, daugiau ciklu prasuka apie 20
            for (int i = 2; i <= (long) Math.sqrt(n); i++) { //optimized apie 6
                System.out.println("looping " + i );
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
