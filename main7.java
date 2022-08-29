import java.util.Scanner;

public class main7 {
    // Sum and Product of two number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();

        int sum = a + b;
        int product = a * b;
        System.out.print("Sum of a and b:");
        System.out.print(sum);
        System.out.print("\nProduct of a and b:");
        System.out.print(product);

    }
}
