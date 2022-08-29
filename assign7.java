public class assign7 {
    // Function assignment
    public static void avg(int a, int b, int c) {
        int average = (a + b + c) / 3;
        System.out.println("The average of three number is " + average);
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void CheckPalindrome(int a) {
        int mynum = a;
        int pal = 0;
        while (a > 0) {
            int ld = a % 10;
            pal = pal * 10 + ld;
            a /= 10;
        }
        System.out.println("Reverse of a number: " + pal);
        if (pal == mynum) {
            System.out.println(mynum + " is a palindrome");
        } else {
            System.out.println(mynum + " is not a palindrome");
        }
    }

    public static void SumOfDig(int a) {
        int sum = 0;
        int mynum = a;
        while (a > 0) {
            int ld = a % 10;
            sum += ld;
            a /= 10;

        }
        System.out.println("Sum of " + mynum + " is " + sum);
    }

    public static void main(String[] args) {
        avg(5, 6, 7);
        System.out.println(isEven(4));
        CheckPalindrome(122);
        SumOfDig(23466);

    }
}
