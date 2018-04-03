package offer;

import java.util.Stack;

public class Main20 {


    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length == 0 || popA.length == 0) {
            return false;
        }

        Stack<Integer> s = new Stack<Integer>();

        int popIndex = 0;

        for (int i = 0; i < pushA.length; i++) {
            s.push(pushA[i]);

            while (!s.empty() && s.peek() == popA[popIndex]) {
                s.pop();
                popIndex++;
            }
        }
        return s.empty();

    }


}
