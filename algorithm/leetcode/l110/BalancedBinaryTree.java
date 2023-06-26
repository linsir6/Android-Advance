package algorithm.leetcode.l110;

public class BalancedBinaryTree {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }


    public boolean isBalanced(TreeNode root) {
        return isBalancedInternal(root) != -1;
    }

    public int isBalancedInternal(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = isBalancedInternal(root.left);
        int right = isBalancedInternal(root.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        } else {
            return Math.max(left, right) + 1;
        }
    }


}
