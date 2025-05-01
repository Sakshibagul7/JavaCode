public class trappingWaterLevel {

    public static void trappedWater(int nums[]) {
        int n = nums.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(nums[i], leftMax[i - 1]);
        }

        rightMax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(nums[i], rightMax[i + 1]);
        }

        int tw = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            tw += waterLevel - nums[i];
        }

        System.out.println("Trapped Water: " + tw);
    }

    public static void main(String[] args) {
        int nums[] = {4, 2, 0, 6, 3, 2, 5};
        trappedWater(nums);
    }
}
