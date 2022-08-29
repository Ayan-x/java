public class main46 {
    public static void DectoBin(int n) {
        int pow = 0;
        int binnum = 0;
        int mynum = n;
        while (n > 0) {
            int rem = n % 2;
            binnum += rem * (int) Math.pow(10, pow);

            pow++;
            n /= 2;
        }
        System.out.println("Binary of " + mynum + " is " + binnum);
    }

    public static void main(String[] args) {
        DectoBin(5);
        DectoBin(10);

    }
}
