import java.util.Scanner;

public class main16 {
    public static void main(String[] args) {
        // Conditional Statement
        // If-else Statement and else if statement
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Adult: drive, vote");
        }

        else if (age > 13 && age < 18) {
            System.out.println("Teenager");

        }

        else {
            System.out.println("Child");
        }
    }

}
