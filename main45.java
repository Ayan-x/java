public class main45 {
    // Prime in range
    public static void bintoDec(int n) {
        int pow = 0;
        int decnum = 0;
        int mynum = n;
        while (n > 0) {
            int ld = n % 10;
            decnum = decnum + (ld * (int) Math.pow(2, pow));

            pow++;
            n /= 10;
        }
        System.out.println("Decimal of " + mynum + " is " + decnum);

    }

    public static void main(String[] args) {
        bintoDec(111);
        bintoDec(11);

    }
}
