package nowcoder;

/**
 * JZ43, https://www.nowcoder.com/practice/12d959b108cb42b1ab72cef4d36af5ec?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ43 {

    //"abcXYZdef",3  -> "XYZdefabc"
    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char[] strChars = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = n; i < strChars.length; i++) {
            result.append(strChars[i]);
        }
        for (int i = 0; i < n; i++) {
            result.append(strChars[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        JZ43 jz43 = new JZ43();
        System.out.println(jz43.LeftRotateString("abcXYZdef", 3));
    }
}
