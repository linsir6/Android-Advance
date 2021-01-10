package nowcoder;

import java.util.ArrayList;

/**
 * JZ41, https://www.nowcoder.com/practice/c451a3fd84b64cb19485dad758a55ebe?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ41 {

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> resp = new ArrayList<>();
        if (sum <= 0) {
            return resp;
        }
        int leftP = 1;
        int rightP = 2;
        int sumVal = leftP + rightP;

        while (sum > rightP) {
            if (sumVal < sum) {
                rightP++;
                sumVal += rightP;
            } else if (sumVal > sum) {
                sumVal -= leftP;
                leftP++;
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = leftP; i <= rightP; i++) {
                    list.add(i);
                }
                resp.add(list);

                rightP++;
                sumVal += rightP;
            }
        }
        return resp;
    }

    public static void main(String[] args) {
        JZ41 jz41 = new JZ41();
        jz41.FindContinuousSequence(3);
    }

}
