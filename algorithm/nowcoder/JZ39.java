package nowcoder;

public class JZ39 {

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int value) {
            this.val = value;
        }
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(treePath(root.left) - treePath(root.right)) > 1) {
            return false;
        }
        IsBalanced_Solution(root.left);
        IsBalanced_Solution(root.right);
        return true;
    }

    public int treePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return treePath(root.left) > treePath(root.right) ? treePath(root.left) + 1 : treePath(root.right) + 1;
    }

}
