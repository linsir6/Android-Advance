package algorithm.leetcode.l103;


import algorithm.leetcode.l102.BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        boolean even = false;
        while (queue.size() > 0) {
            int size = queue.size();
            List<Integer> singleResult = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.remove(0);
                singleResult.add(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            if (even){
                Collections.reverse(singleResult);
                result.add(singleResult);
            }else {
                result.add(singleResult);
            }
            even = !even;

        }
        return result;
    }


}
