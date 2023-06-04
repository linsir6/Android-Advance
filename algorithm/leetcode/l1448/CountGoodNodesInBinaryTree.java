package attention.leetcode.l1448;

public class CountGoodNodesInBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    public int dfs(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }
        int goodNum = root.val >= max ? 1 : 0;
        max = Math.max(max, root.val);
        goodNum += dfs(root.left, max);
        goodNum += dfs(root.right, max);
        return goodNum;
    }


}
