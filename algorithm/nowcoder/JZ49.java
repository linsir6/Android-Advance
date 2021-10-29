package nowcoder;

public class JZ49 {
    //"+2147483647" ->  2147483647
    //"1a33"->0
    public int StrToInt(String str) {
        if (str == null || str.equals("")) {
            return 0;
        }
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                if (chars[i] != '+' && chars[i] != '-' && ('0' > chars[i] || '9' < chars[i])) {
                    return 0;
                }
            } else {
                if ('0' > chars[i] || '9' < chars[i]) {
                    return 0;
                }
            }
        }
        String tempStr = null;
        if (chars[0] == '+') {
            tempStr = str.substring(1, chars.length);
            return Integer.parseInt(tempStr);
        }else if (chars[0] == '-'){
            tempStr = str.substring(1,chars.length);
            return Integer.parseInt(tempStr);
        }else {
            tempStr = str;
            return Integer.parseInt(tempStr);
        }
    }

    public static void main(String[] args) {
        JZ49 jz49 = new JZ49();
        System.out.println(jz49.StrToInt("1a33"));
    }
}
