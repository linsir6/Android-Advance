package algorithm.leetcode.l42;

public class TrappingRainWater {

    public int trap(int[] height) {
        int[] prefixMax = new int[height.length];
        int[] suffixMax = new int[height.length];
        int length = height.length;
        prefixMax[0] = height[0];
        for (int i = 1; i < length; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]);
        }

        suffixMax[length - 1] = height[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);
        }
        int result = 0;
        for (int i = 0; i < length; i++) {
            result += Math.min(prefixMax[i], suffixMax[i]) - height[i];
        }
        return result;
    }


}
