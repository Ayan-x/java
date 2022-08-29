import java.util.Scanner;

public class main39 {
    // Functions/ Methods
    public static void printhello() {
        System.out.println("Hello");
        System.out.println("Hello");
    }

    public static int calculatesum(int num1, int num2) { // parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) { 
        printhello(); // Function calling
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a, b); // Arguments or actual parameters
        System.out.println("Sum of a and b: " + sum);
    }
}
