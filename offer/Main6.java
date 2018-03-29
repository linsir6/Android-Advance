package offer;

import java.util.Arrays;

public class Main6 {


    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int len = array.length;
        int left = 0, right = len - 1, mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            if (left + 1 == right)
                return array[right]; //只剩两个
            if (array[right] > array[left]) {
                return array[left];
            }
            if (array[mid] == array[left] && array[mid] == array[right]) {
                return min(array, left, right);
            } else if (array[mid] >= array[left]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return array[mid];
    }

    public int min(int[] array, int left, int right) {
        int min = Integer.MAX_VALUE;
        for (int i = left; i <= right; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }


}
