package offer;

public class Main42 {


    public String LeftRotateString(String str, int n) {
        if(str.equals("")){
            return "";
        }

        String res = "";
        for (int i = n; i < str.length(); i++) {
            res += str.charAt(i);
        }
        for (int i = 0; i < n; i++) {
            res += str.charAt(i);
        }
        return res;
    }


    public static void main(String[] args) {
        Main42 test = new Main42();
        System.out.println(test.LeftRotateString("abcXYZdef",3));
    }

}
