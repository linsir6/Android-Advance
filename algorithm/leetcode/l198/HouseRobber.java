package algorithm.leetcode.l198;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/house-robber/">...</a>
 */
public class HouseRobber {

    public int rob2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(nums[i - 1] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length];
    }

    private int[] cache = null;

    public int rob(int[] nums) {
        cache = new int[nums.length];
        Arrays.fill(cache, -1);
        return dfs(nums.length - 1, nums);
    }

    private int dfs(int i, int[] nums) {
        if (i < 0) {
            return 0;
        }
        if (cache[i] != -1){
            return cache[i];
        }
        int result = Math.max(dfs(i - 1, nums), dfs(i - 2, nums) + nums[i]);
        cache[i] = result;
        return result;
    }

}
