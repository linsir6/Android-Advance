package algorithm.leetcode.l22;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    private int m;
    private int n;
    List<String> result = new ArrayList<>();
    char[] path;

    public List<String> generateParenthesis(int n) {
        this.m = n * 2;
        this.n = n;
        this.path = new char[m];
        dfs(0, 0);
        return result;
    }

    public void dfs(int i, int open) {
        if (i == m) {
            result.add(new String(path));
            return;
        }
        if (open < n) {
            path[i] = '(';
            dfs(i + 1, open + 1);
        }
        if (i - open < open) {
            path[i] = ')';
            dfs(i + 1, open);
        }
    }

}
