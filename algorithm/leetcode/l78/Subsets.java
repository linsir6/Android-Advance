package algorithm.leetcode.l78;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/subsets/">...</a>
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        sub(nums, 0, result, new ArrayList<>());
        return result;
    }

    public void sub(int[] nums, int i, List<List<Integer>> result, List<Integer> currentList) {
        if (i == nums.length) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        sub(nums, i + 1, result, currentList);
        currentList.add(nums[i]);
        sub(nums, i + 1, result, currentList);
        currentList.remove((Integer) nums[i]);
    }

    public void sub2(int[] nums, int i, List<List<Integer>> result, List<Integer> currentList) {
        result.add(new ArrayList<>(currentList));
        if (i == nums.length) {
            return;
        }
        for (int j = i; j < nums.length; j++) {
            currentList.add(nums[j]);
            sub2(nums, j + 1, result, currentList);
            currentList.remove((Integer) nums[j]);
        }
    }
}
