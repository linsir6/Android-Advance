package nowcoder;

import java.util.Stack;

/**
 * JZ5, https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ5 {
    public static class Solution {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            stack1.push(node);
        }

        public int pop() {
            if (stack1.isEmpty() || stack2.isEmpty()) {
                throw new RuntimeException("queue in empty");
            }
            if (stack2.isEmpty()) {
                while (stack1.size() > 0) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            solution.push(1);
            solution.push(2);
            solution.push(3);
            System.out.println(solution.pop());
            System.out.println(solution.pop());
        }
    }


}
