package algorithm.leetcode.l98;

public class ValidateBinarySearchTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public boolean isValidBST(TreeNode root) {
//        return isValidBSTPreOrder(root, Long.MIN_VALUE, Long.MAX_VALUE);
        return isValidBSTInOrder(root);
    }

    private boolean isValidBSTPreOrder(TreeNode root, long left, long right) {
        if (root == null) {
            return true;
        }
        int x = root.val;
        return x < right && x > left && isValidBSTPreOrder(root.left, left, x) && isValidBSTPreOrder(root.right, x, right);
    }

    private long preVal = Long.MIN_VALUE;

    private boolean isValidBSTInOrder(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBSTInOrder(root.left)) {
            return false;
        }
        if (root.val <= preVal) {
            return false;
        }
        preVal = root.val;
        return isValidBSTInOrder(root.right);
    }

    //return dfs(root)[1] != Long.MAX_VALUE;
    private long[] isValidBSTPostOrder(TreeNode root) {
        if (root == null) {
            return new long[]{Long.MAX_VALUE, Long.MIN_VALUE};
        }
        long[] left = isValidBSTPostOrder(root.left);
        long[] right = isValidBSTPostOrder(root.right);
        long x = root.val;
        // 也可以在递归完左子树之后立刻判断，如果不是二叉搜索树，就不用递归右子树了
        if (x <= left[1] || x >= right[0]) {
            return new long[]{Long.MIN_VALUE, Long.MAX_VALUE};
        }
        return new long[]{Math.min(left[0], x), Math.max(right[1], x)};
    }


}
