package attention.leetcode.l1372;

public class LongestZigzagPathInABinaryTree {

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

    private int maxLength = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root, true, 0);
        dfs(root, false, 0);
        return maxLength;
    }

    public void dfs(TreeNode root, boolean left, int len) {
        maxLength = Math.max(maxLength, len);
        if (left) {
            if (root.left != null) {
                dfs(root.left, false, len + 1);
            }
            if (root.right != null) {
                dfs(root.right, true, 1);
            }
        } else {
            if (root.right != null) {
                dfs(root.right, true, len + 1);
            }
            if (root.left != null) {
                dfs(root.left, false, 1);
            }
        }
    }


}
