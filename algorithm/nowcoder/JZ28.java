package nowcoder;

/**
 * JZ28, https://www.nowcoder.com/practice/e8a1b01a2df14cb2b228b30ee6a92163?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ28 {
    //[1,2,3,2,2,2,5,4,2]
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int maxNumsValue = array[0];
        int count = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == maxNumsValue) {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    count = 1;
                    maxNumsValue = array[i];
                }
            }
        }
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxNumsValue) {
                count++;
            }
        }
        if (count > array.length / 2) {
            return maxNumsValue;
        } else {
            return 0;
        }
    }

}
