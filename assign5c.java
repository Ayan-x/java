import java.util.Scanner;

public class assign5c {
    public static void main(String[] args) {
        // factorial
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 1;

        for (int i = 2; i <= num; i++) {
            sum *= i;

        }
        System.out.println("Factorial of a given number: " + sum);
    }
}
