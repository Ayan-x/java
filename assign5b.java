import java.util.Scanner;

public class assign5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, choice;
        int oddsum = 0;
        int evensum = 0;

        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddsum += number;
            }
            System.out.println("If you want to continue press 1 for choice either 0");
            choice = sc.nextInt();

        } while (choice == 1);
        System.out.println("Sum of even number: " + evensum);
        System.out.println("Sum of odd number: " + oddsum);
    }
}
