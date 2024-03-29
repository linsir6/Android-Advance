package algorithm.leetcode.l199;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> rightSideViewV2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<TreeNode> list = new ArrayList<>();
        list.add(root);

        while (list.size() > 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = list.remove(0);
                if (temp.left != null) {
                    list.add(temp.left);
                }
                if (temp.right != null) {
                    list.add(temp.right);
                }
                if (i == size - 1) {
                    res.add(temp.val);
                }
            }
        }
        return res;
    }

    public List<Integer> rightSideView(TreeNode root) {
        rightSideViewInternal(root, 0);
        return result;
    }

    private List<Integer> result = new ArrayList<>();

    private void rightSideViewInternal(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (depth == result.size()) {
            result.add(root.val);
        }
        rightSideViewInternal(root.right, depth + 1);
        rightSideViewInternal(root.left, depth + 1);
    }


}
