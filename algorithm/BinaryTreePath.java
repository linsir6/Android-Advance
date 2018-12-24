import java.util.ArrayList;

public class BinaryTreePath {

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int value) {
            this.val = value;
        }
    }

    public static boolean getPathFromRoot(TreeNode root, TreeNode node, ArrayList<Integer> pathArray) {
        if (root == null || node == null) return false;
        pathArray.add(root.val);
        if (root.val == node.val) return true;
        if (getPathFromRoot(root.left, node, pathArray)) return true;
        if (getPathFromRoot(root.right, node, pathArray)) return true;
        pathArray.remove((Integer) root.val);
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
        n3.left = n4;
        n3.right = n5;
        ArrayList<Integer> list = new ArrayList<>();
        getPathFromRoot(n1, n5, list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
