public class main59 {
    // Trapped RainWater 
    public static int Trappedrainwater(int height[]) {
        int n = height.length;
        // Left Max Boundary
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // Right Max Boundary
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trappedWater = 0;
        // Loop
        for (int i = 0; i < n; i++) {
            // waterlevel = min(leftmax, rightmax)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // trapped water = waterlevel- height[i]
            trappedWater += waterlevel - height[i];

        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println("Amount of water trapped: " + Trappedrainwater(height) + " unit");

    }
}
