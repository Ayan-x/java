import java.util.Scanner;

public class main18 {
    public static void main(String[] args) {
        // No. is even or odd
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "(Even)");
        } else {
            System.out.println(num + "(Odd)");
        }

    }
}
