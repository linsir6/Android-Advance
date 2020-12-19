package nowcoder;

import java.util.Stack;

/**
 * JZ21, https://www.nowcoder.com/practice/d77d11405cc7470d82554cb392585106?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ21 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0, j = 0; i < pushA.length; i++) {
            s.push(pushA[i]);
            while (j < pushA.length && s.peek() == popA[j]) {
                s.pop();
                j = j + 1;
            }
        }
        return s.empty();
    }
}
