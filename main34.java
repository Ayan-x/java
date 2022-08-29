import java.util.*;

public class main34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number == 2) {
            System.out.println("2 is prime");
        } else {

            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;

                    break;
                }

            }

            if (isPrime == true) {
                System.out.println(number + " is prime.");
            } else {
                System.out.println(number + " is not prime");
            }

        }

    }
}
