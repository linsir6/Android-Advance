package algorithm.leetcode.l1768;

/**
 * <a href="https://leetcode.cn/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75">...</a>
 */
public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int word1Length = word1.length();
        int word2Length = word2.length();

        int minLength = Math.min(word1Length, word2Length);
        for (int i = 0; i < minLength; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }


        if (word2Length > minLength) {
            for (int i = minLength; i < word2Length; i++) {
                result.append(word2.charAt(i));
            }
        }

        if (word1Length > minLength) {
            for (int i = minLength; i < word1Length; i++) {
                result.append(word1.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();
        System.out.println(mergeStringsAlternately.mergeAlternately("ab", "pqrs"));
    }
}
