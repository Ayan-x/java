public class main41 {
    // Product of float
    public static float multiply(float a, float b) {
        float product = a * b;
        return product;
    }

    // Factorial
    public static int factorial(int a) {
        int f = 1;

        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;

    }

    // Bionomial Coefficient
    public static float bincoef(int n, int r) {
        // nCr = n!/r! * (n-r)!
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n - r);
        float nCr = n_fact / (r_fact * n_r_fact);
        return nCr;

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        float product = multiply(a, b);
        System.out.println("Product of a and b: " + product);
        int fact = factorial(a);
        System.out.println("Factorial of a: " + fact);
        float nCr = bincoef(b, a);
        System.out.println("Bionomial coefficient of b with a: " + nCr);
    }
}
