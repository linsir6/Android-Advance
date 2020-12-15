package nowcoder;

public class JZ17 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return false;
        }
        return hasSubtreeInternal(root1, root2);
    }

    public boolean hasSubtreeInternal(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            if (isSubTree(root1, root2)) {
                return true;
            }
        }
        return hasSubtreeInternal(root1.left, root2) || hasSubtreeInternal(root1.right, root2);
    }

    public boolean isSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
    }


}
