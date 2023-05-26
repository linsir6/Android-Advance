package attention;

import java.util.ArrayList;
import java.util.List;

/**
 * 寻找二叉树根节点到数上任意节点的路径
 */
public class BinaryTreePath {

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int value) {
            this.val = value;
        }
    }

    private static boolean getPathFromRoot(TreeNode root, TreeNode target, List<Integer> list) {
        if (root == null || target == null) {
            return false;
        }
        list.add(root.val);

        if (root.val == target.val) {
            return true;
        }

        if (getPathFromRoot(root.left, target, list)){
            return true;
        }

        if (getPathFromRoot(root.right, target, list)){
            return true;
        }
        list.remove((Integer) root.val);
        return false;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        ArrayList<Integer> list = new ArrayList<>();
        getPathFromRoot(n1, n5, list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
