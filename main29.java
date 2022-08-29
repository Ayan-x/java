public class main29 {
    public static void main(String[] args) {
        // Printing reverse number
        int n = 234567;
        while (n > 0) {
            int ld = n % 10;
            System.out.print(ld);
            n /= 10;
        }
    }
}
