public class assign8 {
    public static boolean numberrepeat(int number[]) {
        // String t = "false";
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] == number[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Ques 2 not done
    public static void rotated(int number[], int target) {

    }

    // Ques 3 (Maximum profit from stocks)
    public static int maxprofitStock(int price[]) {
        int maxprofit = 0;
        int buyprices = Integer.MAX_VALUE;
        for (int i = 0; i < price.length; i++) {
            if (buyprices < price[i]) {
                int profit = price[i] - buyprices;
                maxprofit = Math.max(profit, maxprofit);
            } else {
                buyprices = price[i];
            }

        }
        return maxprofit;
    }

    // Ques 4(Trapped rain Water)
    public static int trappedWater(int height[]) {
        // Left Max Boundary
        int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // Right max Boundary
        int rightmax[] = new int[n];
        // int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        // Water level
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            // trapped water
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 5, 1, 1, 3, 3, 5, 5 };
        int price[] = { 7, 1, 5, 4, 6, 9 };
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        // System.out.println(numberrepeat(number));
        // System.out.println(maxprofitStock(price));
        System.out.println(trappedWater(height));

    }
}
