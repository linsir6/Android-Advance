package algorithm.leetcode.l198;

/**
 * <a href="https://leetcode.cn/problems/house-robber/">...</a>
 */
public class HouseRobber {

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(nums[i-1] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length];
    }


}
