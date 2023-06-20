package algorithm.leetcode.l33;

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int left = -1;
        int right = nums.length;
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            if (isBlue(nums, mid, target)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (right == nums.length || nums[right] != target) {
            return -1;
        }
        return right;
    }

    private boolean isBlue(int[] nums, int i, int target) {
        int end = nums[nums.length - 1];
        if (nums[i] > end) {
            return target > end && nums[i] >= target;
        } else {
            return target > end || nums[i] >= target;
        }
    }


}
