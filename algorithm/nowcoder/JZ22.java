package nowcoder;

import java.util.ArrayList;

/**
 * JZ22, https://www.nowcoder.com/practice/7fe2212963db4790b57431d9ed259701?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ22 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root == null) {
            return arrayList;
        }
        ArrayList<TreeNode> nodeArrayList = new ArrayList<>();
        nodeArrayList.add(root);
        while (nodeArrayList.size() > 0) {
            TreeNode tempNode = nodeArrayList.remove(0);
            arrayList.add(tempNode.val);
            if (tempNode.left != null) {
                nodeArrayList.add(tempNode.left);
            }
            if (tempNode.right != null) {
                nodeArrayList.add(tempNode.right);
            }
        }
        return arrayList;
    }

}
