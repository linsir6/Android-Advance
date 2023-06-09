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


}
