package offer;

import java.util.Stack;

public class Main5 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int temp = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return temp;

    }

    public static void main(String[] args) {
        Main5 main5 = new Main5();
        main5.push(1);
        main5.push(2);
        main5.push(3);
        main5.push(4);

        System.out.println(main5.pop());
        System.out.println(main5.pop());


    }

}
