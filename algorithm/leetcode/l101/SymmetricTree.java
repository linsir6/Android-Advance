package algorithm.leetcode.l101;

public class SymmetricTree {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }


    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

}
