package nowcoder;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class JZ34 {

    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.equals("")) {
            return -1;
        }
        HashMap<Character, Integer> hashMap = new LinkedHashMap<>(str.length());
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!hashMap.containsKey(chars[i])) {
                hashMap.put(chars[i], 1);
            } else {
                hashMap.put(chars[i], hashMap.get(chars[i]) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return str.indexOf(entry.getKey());
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        JZ34 jz34 = new JZ34();
        System.out.println(jz34.FirstNotRepeatingChar("NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp"));
    }


}
