package algorithm.leetcode.l100;

public class SameTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

    }


    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
