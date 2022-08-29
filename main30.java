public class main30 {
    public static void main(String[] args) {
        int n = 897;
        int rev = 0;
        while (n > 0) {
            int ld = n % 10;
            rev = (rev * 10) + ld;
            n /= 10;
        }
        System.out.println("The reverse number is " + rev);
    }
}
