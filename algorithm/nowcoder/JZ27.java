package nowcoder;

import java.util.ArrayList;
import java.util.Collections;

public class JZ27 {

    public ArrayList<String> Permutation(String str) {
        char[] charArray = str.toCharArray();
        ArrayList<String> newStr = new ArrayList<String>();
        build(newStr, 0, charArray);
        Collections.sort(newStr);
        return newStr;
    }

    private void build(ArrayList<String> str, int i, char[] c) {
        if (i == c.length - 1) {
            str.add(new String(c));
        }
        for (int j = i; j < c.length; j++) {
            if (i == j || c[j] != c[i]) {
                swap(c, i, j);
                build(str, i + 1, c);
                swap(c, i, j);
            }
        }
    }

    private char[] swap(char[] c, int i, int j) {
        char g = c[i];
        c[i] = c[j];
        c[j] = g;
        return c;
    }

    public static void main(String[] args) {
        JZ27 jz27 = new JZ27();
        ArrayList<String> arrayList = jz27.Permutation("abc");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println();
    }

}
