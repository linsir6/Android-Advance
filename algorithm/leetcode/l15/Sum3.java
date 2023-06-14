package algorithm.leetcode.l15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {


    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int s = nums[i];
            if (i > 0 && s == nums[i - 1]) {
                continue;
            }
            int begin = i + 1;
            int end = nums.length - 1;
            while (begin < end) {
                int sum = s + nums[begin] + nums[end];
                if (sum > 0) {
                    end--;
                } else if (sum < 0) {
                    begin++;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(s);
                    temp.add(nums[begin]);
                    temp.add(nums[end]);
                    res.add(temp);
                    begin++;
                    while (begin < end && nums[begin] == nums[begin - 1]) {
                        begin++;
                    }
                    end--;
                    while (begin < end && nums[end] == nums[end + 1]) {
                        end--;
                    }
                }
            }
        }
        return res;
    }

}
