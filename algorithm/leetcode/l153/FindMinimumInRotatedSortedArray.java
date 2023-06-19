package algorithm.leetcode.l153;

public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        int left = -1;
        int right = nums.length - 1;
        while (left + 1 < right){
            int mid = (left+right)/2;
            if (nums[mid] < nums[nums.length -1]){
                right = mid;
            }else {
                left = mid;
            }
        }
        return nums[right];
    }

}
