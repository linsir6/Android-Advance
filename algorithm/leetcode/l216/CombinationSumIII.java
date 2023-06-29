package algorithm.leetcode.l216;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();
    private int k;

    public List<List<Integer>> combinationSum3(int k, int n) {
        this.k = k;
        dfs(9, n);
        return result;
    }

    public void dfs(int i, int t) {
        int d = k - path.size();
        if (t < 0 || t > (i * 2 - d + 1) * d / 2) {
            return;
        }
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int j = i; j > d - 1; j--) {
            path.add(j);
            dfs(j - 1, t - j);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSumIII com = new CombinationSumIII();
        List<List<Integer>> result = com.combinationSum3(3, 7);
        System.out.println(result.size());
    }


}
