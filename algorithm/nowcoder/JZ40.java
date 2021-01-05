package nowcoder;

/**
 * JZ40, https://www.nowcoder.com/practice/e02fdb54d7524710a7d664d082bb7811?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ40 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null) {
            return;
        }
        int xor = 0;
        for (int temp : array) {
            xor = xor ^ temp;
        }
        int classify = xor & (-xor);
        for (int temp : array) {
            int condition = temp & classify;
            if (condition == 0) {
                num1[0] = num1[0] ^ temp;
            } else {
                num2[0] = num2[0] ^ temp;
            }
        }
    }

}
