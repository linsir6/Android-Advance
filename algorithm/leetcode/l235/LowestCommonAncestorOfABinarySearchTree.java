package algorithm.leetcode.l235;

public class LowestCommonAncestorOfABinarySearchTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int val = root.val;
        if (p.val < val && q.val < val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (p.val > val && q.val > val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }


}
