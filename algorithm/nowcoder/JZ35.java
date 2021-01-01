package nowcoder;

/**
 * JZ25, https://www.nowcoder.com/practice/96bd6684e04a44eb80e6a68efc0ec6c5?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ35 {
    public Integer count = 0;

    public Integer InversePairs(int[] array) {
        divMerge(array, 0, array.length - 1);
        return count;
    }

    public void divMerge(int[] array, int left, int right) {
        if (left >= right) return;
        int middle = left + (right - left) / 2;
        divMerge(array, left, middle);
        divMerge(array, middle + 1, right);

        int i = left;
        int j = middle + 1;
        int[] tmp = new int[right - left + 1];
        int k = 0;
        while (i <= middle && j <= right) {
            if (array[i] > array[j]) {
                count += middle - i + 1;
                count %= 1000000007;
                tmp[k++] = array[j++];
            } else {
                tmp[k++] = array[i++];
            }
        }
        while (j <= right) {
            tmp[k++] = array[j++];
        }
        while (i <= middle) {
            tmp[k++] = array[i++];
        }
        for (int l = 0; l < k; l++) {
            array[left++] = tmp[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 4, 5, 2};
        JZ35 jz35 = new JZ35();
        System.out.println(jz35.InversePairs(arr));
    }
}
