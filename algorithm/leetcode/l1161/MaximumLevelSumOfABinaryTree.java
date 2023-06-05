package algorithm.leetcode.l1161;

import java.util.ArrayList;
import java.util.List;

public class MaximumLevelSumOfABinaryTree {


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


    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        int level = 0;
        int maxLevel = 1;
        int maxSum = Integer.MIN_VALUE;
        while (list.size() != 0) {
            int size = list.size();
            int sum = 0;
            level++;
            for (int i = 0; i < size; i++) {
                TreeNode temp = list.remove(0);
                if (temp.left != null) {
                    list.add(temp.left);
                }
                if (temp.right != null) {
                    list.add(temp.right);
                }
                sum = sum + temp.val;
                if (i == size - 1 && sum > maxSum) {
                    maxSum = sum;
                    maxLevel = level;
                }
            }
        }
        return maxLevel;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(989);
        TreeNode treeNode2 = new TreeNode(10250);
        TreeNode treeNode3 = new TreeNode(98693);
        TreeNode treeNode4 = new TreeNode(-89388);
        TreeNode treeNode5 = new TreeNode(-32127);

        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;
        treeNode4.right = treeNode5;

        MaximumLevelSumOfABinaryTree maximumLevelSumOfABinaryTree = new MaximumLevelSumOfABinaryTree();
        System.out.println(maximumLevelSumOfABinaryTree.maxLevelSum(treeNode1));


    }

}
