import java.util.Scanner;

public class main26 {
    public static void main(String[] args) {
        // Print sum of first n natural number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of " + n + "natural number: " + sum);

    }
}
