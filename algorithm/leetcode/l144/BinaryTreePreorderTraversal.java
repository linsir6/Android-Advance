package algorithm.leetcode.l144;

import algorithm.OrderBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value) {
            this.val = value;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode p = root;
        List<TreeNode> stack = new ArrayList<>();
        while (p != null || stack.size() > 0) {
            while (p != null) {
                System.out.println(p.val);
                list.add(p.val);
                stack.add(p);
                p = p.left;
            }
            TreeNode temp = stack.remove(stack.size() - 1);
            if (temp != null) {
                p = temp.right;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

//        preorderTraversal(node1);
    }

}
