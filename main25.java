import java.util.Scanner;

public class main25 {
    // Printing number 1 to n using while loop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range:");
        int range = sc.nextInt();
        int counter = 1;

        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
        }
        // System.out.println();
    }
}

