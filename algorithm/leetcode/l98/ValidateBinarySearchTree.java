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
    private boolean isValidBSTInOrder(TreeNode root){
        if (root == null){
            return true;
        }
        if (!isValidBSTInOrder(root.left)){
            return false;
        }
        if (root.val <= preVal){
            return false;
        }
        preVal = root.val;
        return isValidBSTInOrder(root.right);
    }

}
