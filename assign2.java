import java.util.Scanner;

public class assign2 {
    public static void main(String[] args) {
        // Sum of three numbers
        Scanner rsc = new Scanner(System.in);
        // System.out.println("assign2.main()");
        System.out.print("Enter a:");
        int a = rsc.nextInt();
        System.out.print("Enter b:");
        int b = rsc.nextInt();
        System.out.print("Enter c:");
        int c = rsc.nextInt();
        float average = (a + b + c) / 3;
        System.out.print("Average:" + average);
        // System.out.println(average);
        System.out.println();
        // Bill making
        System.out.print("Enter price of pencil:");
        float pencil = rsc.nextFloat();
        System.out.print("Enter price of pen:");
        float pen = rsc.nextFloat();
        System.out.print("Enter price of eraser:");
        float eraser = rsc.nextFloat();
        float sum = pencil + pen + eraser;
        float gst = 0.18f * sum;
        float total = sum + gst;
        System.out.print("Total amount:" + total);
        // System.out.println(total);

    }
}
