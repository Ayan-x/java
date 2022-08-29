public class main42 {
    // Function Overloading using parameters
    // func to calculate sum of 2 nums
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;

    }

    public static void main(String[] args) {
        int add1 = sum(2, 4);
        System.out.println(add1);
        int add2 = sum(2, 4, 6);
        System.out.println(add2);

    }
}
