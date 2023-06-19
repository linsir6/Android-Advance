package algorithm.leetcode.l162;

public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int left = -1;
        int right = nums.length - 1;

        while (left + 1 < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }


}
