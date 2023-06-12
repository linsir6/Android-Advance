package algorithm.leetcode.l209;

/**
 * <a href="https://leetcode.cn/problems/minimum-size-subarray-sum/">...</a>
 */
public class MinimumSizeSubArraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int length = nums.length;
        int min = length + 1;

        int left = 0;
        int right = 0;
        int currentTotal = 0;

        while (right < length) {
            currentTotal = currentTotal + nums[right];
            while (left <= right && currentTotal - nums[left] >= target) {
                currentTotal = currentTotal - nums[left];
                left++;
            }
            if (currentTotal >= target) {
                min = Math.min(min, right - left + 1);
            }
            right++;
        }
        return min == length + 1 ? 0 : min;
    }

    public static void main(String[] args) {
        MinimumSizeSubArraySum minimumSizeSubArraySum = new MinimumSizeSubArraySum();
        System.out.println(minimumSizeSubArraySum.minSubArrayLen(15, new int[]{1, 2, 3, 4, 5}));
    }

}
