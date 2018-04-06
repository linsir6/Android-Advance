package offer;

public class Main38 {


    public int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        return Integer.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null)
            return true;

        if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1)
            return false;


        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);

    }
}
