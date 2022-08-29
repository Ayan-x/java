public class main58 {
    // Kadanes Algorithm
    public static void kadanes(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < number.length; i++) {
            cs += number[i];
            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(cs, ms);

        }

        System.out.println("Maximum sum: " + ms);
    }

    public static void main(String[] args) {
        int number[] = { -1, -2, -6, -1, -3 };
        kadanes(number);

    }
}
