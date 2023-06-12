package algorithm.leetcode.l713;

public class SubArrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0 || k == 1) {
            return 0;
        }
        int prod = 1;
        int left = 0;
        int right = 0;
        int length = nums.length;
        int result = 0;

        while (right < length) {
            prod = prod * nums[right];
            while (prod >= k) {
                prod = prod / nums[left];
                left++;
            }
            result = result + right - left + 1;
            right++;
        }
        return result;
    }


}
