public class main44 {
    public static boolean isPrime(int n) {
        // Check Prime(optimized way)
        // Corner case
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;

                }
            }
            return true;
        }

    }

    public static void PrimeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        PrimeInRange(100);
    }
}
