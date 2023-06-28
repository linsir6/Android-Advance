package algorithm.leetcode.l494;

public class TargetSum {

    public int findTargetSumWays(int[] nums, int target) {
        for (int x : nums) {
            target += x;
        }
        if (target < 0 || target % 2 == 1) {
            return 0;
        }
        target /= 2;

        int n = nums.length;
        int[][] f = new int[n + 1][target + 1];
        f[0][0] = 1;
        for (int i = 0; i < n; ++i) {
            for (int c = 0; c <= target; ++c) {
                if (c < nums[i]) {
                    f[i + 1][c] = f[i][c];
                } else {
                    f[i + 1][c] = f[i][c] + f[i][c - nums[i]];
                }
            }

        }

        return f[n][target];
    }

    //1 2 3 4
    //5 6 7 8
}
