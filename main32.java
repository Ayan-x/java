import java.util.Scanner;

public class main32 {
    public static void main(String[] args) {
        // Keep entering number till user enters a multiple of 10 using break statement
        Scanner sc = new Scanner(System.in);
        do {

            System.out.print("Enter a number: ");
            int a = sc.nextInt();

            if (a % 10 == 0) {
                System.out.println("Number is multiple of 10");
                break;
            }

            System.out.println("Your number is " + a);

        } while (true);

    }
}
