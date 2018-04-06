package offer;

public class Main37 {


    public int TreeDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        if (root.left == null) {
            return TreeDepth(root.right) + 1;
        }

        if (root.right == null) {
            return TreeDepth(root.left) + 1;
        }

        return Integer.max(TreeDepth(root.left), TreeDepth(root.right)) + 1;


    }


}
