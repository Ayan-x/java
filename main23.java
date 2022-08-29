import java.util.Scanner;

public class main23 {
    public static void main(String[] args) {
        // Calculator using switch
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1:");
        float a = sc.nextInt();
        System.out.print("Enter num2:");
        float b = sc.nextInt();
        System.out.print("Enter operator:");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
}
