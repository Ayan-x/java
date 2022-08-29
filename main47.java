public class main47 {
    public static void main(String[] args) {
        // Method Scope and Block Scope
        // System.out.println(p); This will give error because p is not defined yet.
        int p = 10;
        {
            int s = 45;
            System.out.println(p);
            System.out.println(s);
        }
        // System.out.println(s); This will give error because s is present inside block.
    }
}
