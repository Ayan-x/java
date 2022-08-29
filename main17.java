import java.util.Scanner;

public class main17 {
    public static void main(String[] args) {
        // Greatest of three number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.print("Enter c:");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is greatest among all three.");
        } else {
            if (b > c) {
                System.out.println(b + " is greatest among all three.");
            } else {
                System.out.println(c + " is greatest among all three.");
            }
        }
    }
}
