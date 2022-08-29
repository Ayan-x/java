public class main40 {
    // Call by value
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b); // Only giving copy of argument not changing anything in orignal value
        // System.out.println(a);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
