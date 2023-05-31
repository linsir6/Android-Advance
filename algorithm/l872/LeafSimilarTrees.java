package attention.l872;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LeafSimilarTrees {


    public static class TreeNode {
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


    public List<Integer> preOrderBinaryTree(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        if (root.left == null && root.right == null) {
            list.add(root.val);
        }
        preOrderBinaryTree(root.left, list);
        preOrderBinaryTree(root.right, list);
        return list;
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = preOrderBinaryTree(root1, new ArrayList<>());
        List<Integer> list2 = preOrderBinaryTree(root2, new ArrayList<>());
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (!Objects.equals(list1.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(9);
        TreeNode node7 = new TreeNode(8);
        TreeNode node8 = new TreeNode(7);
        TreeNode node9 = new TreeNode(4);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        node5.left = node8;
        node5.right = node9;

        LeafSimilarTrees leafSimilarTrees = new LeafSimilarTrees();
        List<Integer> list = leafSimilarTrees.preOrderBinaryTree(node1, new ArrayList<>());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }


}
