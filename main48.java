public class main48 {
    // Advance Pattern
    public static void hollowrectangle(int totrows, int totcols) {
        // Hollow Rectangle
        // Outer Loop
        for (int i = 1; i <= totrows; i++) {
            // Inner loop
            for (int j = 1; j <= totcols; j++) {
                if (i == 1 || i == totrows || j == 1 || j == totcols) {
                    // cell-(i,j)
                    // Boundary Cell
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    // Half Inverted & Rotated Pyramid

    public static void invtria(int row) {
        // Outer Loop
        for (int i = 1; i <= row; i++) {
            // For Spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // For stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // Inverted Half Pyramid with numbers
    public static void number_pyramid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Floyd Triangle
    public static void floydtri(int n) {
        int m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(m + " ");
                m++;

            }
            System.out.println();
        }
    }

    // 0-1 triangle
    public static void triangle_zero_one(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (number == 1) {
                    System.out.print(number);
                    number = 0;
                } else {
                    System.out.print(number);
                    number = 1;
                }

            }
            System.out.println();
        }
    }

    // Butterfly Pattern
    public static void butterfly_pattern(int n) {
        // Ist Half
        // Outer loop
        for (int i = 1; i <= n; i++) {
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            for (int space = 1; space <= 2 * (n - i); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();

        }
        // IInd Half
        for (int i = n; i >= 1; i--) {
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            for (int space = 1; space <= 2 * (n - i); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // Solid Rhombus
    public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // For Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // For Stars
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    // Hollow Rhombus
    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // For spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Hollow Rectangle code is going to be used for hollow rhombus
            for (int k = 1; k <= n; k++) {
                if (i == 1 || i == n || k == 1 || k == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    // Diamond
    public static void diamond(int n) {
        // Ist Half
        for (int i = 1; i <= n; i++) {
            // For spaces
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            // For Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // IInd Half

        for (int i = n; i >= 1; i--){
            // For spaces
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            // For Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollowrectangle(4, 5);
        // System.out.println();
        // invtria(5);
        // number_pyramid(5);
        // floydtri(5);
        // triangle_zero_one(5);
        // butterfly_pattern(5);
        // rhombus(5);
        // hollow_rhombus(10);
        diamond(5);

    }
}
