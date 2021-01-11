package nowcoder;

/**
 * JZ44, https://www.nowcoder.com/practice/3194a4f4cf814f63919d0790578d51f3?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ44 {
    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char[] arr = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        StringBuilder tempBuilder = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != ' ') {
                tempBuilder.insert(0, arr[i]);
            } else {
                builder.append(tempBuilder);
                builder.append(' ');
                tempBuilder = new StringBuilder();
            }
        }
        builder.append(tempBuilder);
        return builder.toString();
    }

    public static void main(String[] args) {
        JZ44 jz44 = new JZ44();
        System.out.println(jz44.ReverseSentence("nowcoder. a am I"));
    }

}
