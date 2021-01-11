package nowcoder;

import java.util.ArrayList;

/**
 * JZ42, https://www.nowcoder.com/practice/390da4f7a00f44bea7c2f3d19491311b?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ42 {

    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList();
        if (array == null) {
            return list;
        }
        int l = 0;
        int r = array.length - 1;
        while (l < r) {
            if (array[l] + array[r] == sum) {
                list.add(array[l]);
                list.add(array[r]);
                System.out.println(array[l] + "  " + array[r]);
                return list;
            } else if (array[l] + array[r] > sum) {
                r--;
            } else {
                l++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        JZ42 jz42 = new JZ42();
        jz42.FindNumbersWithSum(new int[]{1, 2, 4, 7, 11, 15}, 15);
    }
}
