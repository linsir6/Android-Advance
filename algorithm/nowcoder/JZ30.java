package nowcoder;

public class JZ30 {

    public int FindGreatestSumOfSubArray(int[] array) {
        int maxValue = array[0];
        int curSumValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (curSumValue + array[i] > 0) {
                curSumValue = curSumValue + array[i];
                maxValue = Math.max(maxValue, curSumValue);
            } else {
                curSumValue = 0;
                maxValue = Math.max(maxValue, array[i]);
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        JZ30 jz30 = new JZ30();
        int result = jz30.FindGreatestSumOfSubArray(new int[]{1, -2, 3, 10, -4, 7, 2, -5});
        System.out.println(result);
    }
}
