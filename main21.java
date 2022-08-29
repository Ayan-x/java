import java.util.Scanner;

public class main21 {
    public static void main(String[] args) {
        // Report Card through ternary operator
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String rc = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(rc);

    }
}
