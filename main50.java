public class main50 {
    public static void update(int marks[], int nc) {
        nc = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static void main(String[] args) {

        int mark[] = { 97, 98, 99 };
        int nc = 5;

        update(mark, nc);
        System.out.println(nc); // This does not change due to call by value
        // But array will be updated due to call by reference

        for (int i = 0; i < mark.length; i++) {
            System.out.print(mark[i] + " ");
        }

    }
}
