package offer;

public class Main43 {


    public String ReverseSentence(String str) {
        String res = "", tmp = "";
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == ' ') {
                res = " " + tmp + res;
                tmp = "";
            } else {
                tmp += str.charAt(i);
            }
        }
        if (tmp.length() != 0) {
            res = tmp + res;
        }
        return res;
    }

    public static void main(String[] args) {
        Main43 main43 = new Main43();
        String a = "I am a student.";
        System.out.println(main43.ReverseSentence(a));
    }


}
