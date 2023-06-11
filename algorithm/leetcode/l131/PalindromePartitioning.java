package algorithm.leetcode.l131;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {


    private final List<List<String>> ans = new ArrayList<>();
    private final List<String> path = new ArrayList<>();
    private String s;

    public List<List<String>> partition(String s) {
        this.s = s;
        dfs(0);
        return ans;
    }

    private boolean isPalindrome(int left, int right) {
        while (left < right)
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        return true;
    }

    private void dfs(int i) {
        if (i == s.length()) {
            ans.add(new ArrayList<>(path)); // 固定答案
            return;
        }
        for (int j = i; j < s.length(); j++) { // 枚举子串的结束位置
            if (isPalindrome(i, j)) {
                path.add(s.substring(i, j + 1));
                dfs(j + 1);
                path.remove(path.size() - 1); // 恢复现场
            }
        }
    }


}
