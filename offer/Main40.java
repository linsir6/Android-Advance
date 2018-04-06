package offer;

import java.util.ArrayList;

public class Main40 {


    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if (sum < 3) return list;
        int s = (int) Math.sqrt(2 * sum);
        for (int i = s; i >= 2; i--) {
            if (2 * sum % i == 0) {
                int d = 2 * sum / i;
                if (d % 2 == 0 && i % 2 != 0 || d % 2 != 0 && i % 2 == 0) {
                    int a1 = (d - i + 1) / 2;
                    int an = (d + i - 1) / 2;
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    for (int j = a1; j <= an; j++)
                        temp.add(j);
                    list.add(temp);
                }
            }
        }
        return list;
    }


}
