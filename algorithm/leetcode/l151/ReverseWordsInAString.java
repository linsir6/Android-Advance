package algorithm.leetcode.l151;

public class ReverseWordsInAString {


    public String reverseWords(String s) {
        if (s == null) {
            return "";
        }
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        int end = chars.length - 1;
        int begin = 0;

        while (chars[end] == ' ') {
            end--;
        }
        while (chars[begin] == ' ') {
            begin++;
        }
        boolean isFirstAppend = true;
        while (end >= begin) {
            if (chars[end] != ' ') {
                temp.insert(0, chars[end]);
            } else {
                if (temp.length() != 0) {
                    if (!isFirstAppend) {
                        stringBuilder.append(' ').append(temp);
                    } else {
                        stringBuilder.append(temp);
                        isFirstAppend = false;
                    }
                    temp = new StringBuilder();
                }
            }
            end--;
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.append(temp);
        } else {
            stringBuilder.append(' ').append(temp);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
        System.out.println(reverseWordsInAString.reverseWords(s));
    }


}
