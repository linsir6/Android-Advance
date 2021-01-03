package nowcoder;

/**
 * JZ37, https://www.nowcoder.com/practice/70610bf967994b22bb1c26f9ae901fa2?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ37 {

    public int GetNumberOfK(int[] array, int k) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int b = 0;
        int e = array.length;
        while (b < e) {
            int m = b + (e - b) / 2;
            if (array[m] < k) {
                b = m + 1;
            } else {
                e = m;
            }
        }
        int tempBegin = b;
        b = 0;
        e = array.length;
        while (b < e) {
            int m = b + (e - b) / 2;
            if (array[m] <= k) {
                b = m + 1;
            } else {
                e = m;
            }
        }
        return e - tempBegin;
    }

    public static void main(String[] args) {
        JZ37 jz37 = new JZ37();
        int result = jz37.GetNumberOfK(new int[]{1, 2, 3, 3, 3, 3, 4, 5}, 3);
        System.out.println(result);
    }
}
