package nowcoder;

import java.util.ArrayList;
import java.util.List;

public class JZ26 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    List<TreeNode> list = new ArrayList<>();

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        orderTree(pRootOfTree);
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                list.get(i).left = null;
                if (i + 1 < list.size()) {
                    list.get(i).right = list.get(i + 1);
                }
            } else if (i == list.size() - 1) {
                list.get(i).left = list.get(i - 1);
                list.get(i).right = null;
            } else {
                list.get(i).left = list.get(i - 1);
                list.get(i).right = list.get(i + 1);
            }
        }
        return list.get(0);
    }

    public void orderTree(TreeNode root) {
        if (root == null) {
            return;
        }
        orderTree(root.left);
        list.add(root);
        orderTree(root.right);
    }

    TreeNode pre = null;

    public TreeNode Convert2(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        Convert2(pRootOfTree.right);
        if (pre != null) {
            pRootOfTree.right = pre;
            pre.left = pRootOfTree;
        }
        pre = pRootOfTree;
        Convert2(pRootOfTree.left);
        return pre;
    }
}
