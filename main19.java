import java.util.Scanner;

public class main19 {
    public static void main(String[] args) {
        // Income Tax Calculator
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter income: ");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        }

        else if (income >= 500000 && income <= 999999) {
            tax = (int) (income * 0.2);
        }

        else {
            tax = (int) (income * 0.3);
        }

        System.out.println("Your tax is " + tax);
    }

}
