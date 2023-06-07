package algorithm.leetcode.l345;

/**
 * <a href="https://leetcode.cn/problems/reverse-vowels-of-a-string/submissions/">...</a>
 */
public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {
        if (s == null || s.equals("")) {
            return "";
        }
        char[] arrays = s.toCharArray();
        int begin = 0;
        int end = arrays.length - 1;

        while (end > begin) {
            while (begin <= arrays.length - 1 && !isVowels(arrays[begin]) && end >= begin) {
                begin++;
            }
            while (!isVowels(arrays[end]) && end >= begin) {
                end--;
            }
            if (begin != end && end >= begin) {
                char temp = arrays[begin];
                arrays[begin] = arrays[end];
                arrays[end] = temp;
                begin++;
                end--;
            }
        }
        return new String(arrays);
    }

    private boolean isVowels(char inputChar) {
        return inputChar == 'a'
                || inputChar == 'e'
                || inputChar == 'i'
                || inputChar == 'o'
                || inputChar == 'u'
                || inputChar == 'A'
                || inputChar == 'E'
                || inputChar == 'I'
                || inputChar == 'O'
                || inputChar == 'U';
    }

    public static void main(String[] args) {
        ReverseVowelsOfAString reverseVowelsOfAString = new ReverseVowelsOfAString();
        System.out.println(reverseVowelsOfAString.reverseVowels("a."));
    }

}
