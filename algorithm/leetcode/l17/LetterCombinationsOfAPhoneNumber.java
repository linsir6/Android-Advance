package algorithm.leetcode.l17;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/letter-combinations-of-a-phone-number/">...</a>
 */
public class LetterCombinationsOfAPhoneNumber {

    String[] mapping = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    List<String> result = new ArrayList<>();
    private char[] digitsChars;
    private char[] path;

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        digitsChars = digits.toCharArray();
        path = new char[digits.length()];
        dfs(0);
        return result;
    }

    public void dfs(int depth) {
        if (depth == path.length) {
            result.add(new String(path));
            return;
        }
        String s = mapping[digitsChars[depth] - '0'];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            path[depth] = chars[i];
            dfs(depth + 1);
        }
    }


    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber number = new LetterCombinationsOfAPhoneNumber();
        number.letterCombinations("23");
    }
}
