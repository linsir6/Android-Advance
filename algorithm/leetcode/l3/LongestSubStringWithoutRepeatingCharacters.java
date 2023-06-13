package algorithm.leetcode.l3;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int result = 0;
        char[] chars = s.toCharArray();

        for (int right = 0; right < chars.length; right++) {
            map.put(chars[right], map.getOrDefault(chars[right], 0) + 1);
            while (map.getOrDefault(chars[right], 0) > 1) {
                map.put(chars[left], map.getOrDefault(chars[left], 0) - 1);
                left++;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }


}
