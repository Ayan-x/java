public class main11 {
    public static void main(String[] args) {
        // Type promotion
        char a = 'a';
        char b = 'b';
        System.out.println(b - a);
        byte c = 10;
        // byte d = c*2;
        byte d = (byte) (c * 2);
        System.out.println(d);

    }
}
