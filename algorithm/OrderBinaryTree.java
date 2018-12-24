import java.util.ArrayList;
import java.util.Stack;

public class OrderBinaryTree {

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int value) {
            this.val = value;
        }
    }

    private static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    private static void preOrder1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        while (p != null || !stack.empty()) {
            while (p != null) {
                System.out.print(p.val + "  ");
                stack.push(p);
                p = p.left;
            }
            if (!stack.empty()) {
                TreeNode temp = stack.pop();
                p = temp.right;
            }
        }
    }

    private static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    private static void inOrder1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        while (p != null || !stack.empty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            if (!stack.empty()) {
                TreeNode temp = stack.pop();
                System.out.print(temp + "  ");
                p = temp.right;
            }
        }
    }

    private static void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }

    private static void postOrder1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null)
            return;
        TreeNode cur, pre = null;
        stack.push(root);
        while (!stack.empty()) {
            cur = stack.peek();
            if ((cur.left == null && cur.right == null) || (pre != null && (cur.left == pre || cur.right == pre))) {
                TreeNode temp = stack.pop();
                System.out.println(temp.val);
                pre = temp;
            } else {
                if (cur.right != null)
                    stack.push(cur.right);
                if (cur.left != null)
                    stack.push(cur.left);
            }
        }
    }

    public static void main(String[] args) {

    }

}
