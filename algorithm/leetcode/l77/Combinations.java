package algorithm.leetcode.l77;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();
    private int k;

    public List<List<Integer>> combine(int n, int k) {
        this.k = k;
        dfs(n);
        return result;
    }

    private void dfs(int n) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        int d = k - path.size();
        for (int i = n; i >= d; i--) {
            path.add(i);
            dfs(i - 1);
            path.remove(path.size() - 1);
        }
    }

}
