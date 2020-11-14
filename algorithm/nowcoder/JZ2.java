package nowcoder;

/**
 * JZ2, https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&&tqId=11155&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class JZ2 {

    /**
     * easy
     */
    public static String replaceSpace(StringBuffer str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result.append("%");
                result.append("2");
                result.append("0");
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy");
        String result = replaceSpace(str);
        System.out.println(result);
    }

}
