package algorithm.leetcode.l124;

public class BinaryTreeMaximumPathSum {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPathSumInternal(root);
        return max;
    }

    public int maxPathSumInternal(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = Math.max(maxPathSumInternal(root.left), 0);
        int rightMax = Math.max(maxPathSumInternal(root.right), 0);
        max = Math.max(leftMax + rightMax + root.val, max);
        return Math.max(leftMax + root.val, rightMax + root.val);
    }

}
