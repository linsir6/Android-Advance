package algorithm.leetcode.l513;

import algorithm.leetcode.l102.BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class FindBottomLeftTreeValue {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public int findBottomLeftValue(TreeNode root) {
        List<TreeNode> queue = new ArrayList<>();
        int val = 0;
        queue.add(root);
        while (queue.size() > 0) {
            TreeNode temp = queue.remove(0);
            val = temp.val;
            if (temp.right != null) {
                queue.add(temp.right);
            }
            if (temp.left != null) {
                queue.add(temp.left);
            }
        }
        return val;
    }
}
