package algorithm.leetcode.l167;

public class TwoSumIIInput {


    public int[] twoSum(int[] numbers, int target) {
        int begin = 0;
        int end = numbers.length - 1;

        while (begin < end) {
            if (numbers[begin] + numbers[end] == target) {
                return new int[]{begin + 1, end + 1};
            } else if (numbers[begin] + numbers[end] < target) {
                begin++;
            } else {
                end--;
            }
        }
        return new int[2];
    }

}
