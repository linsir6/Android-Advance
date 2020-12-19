package nowcoder;

/**
 * JZ18, https://www.nowcoder.com/practice/564f4c26aa584921bc75623e48ca3011?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ18 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public void Mirror(TreeNode root) {
            if (root == null) {
                return;
            }
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            Mirror(root.left);
            Mirror(root.right);
        }


    }
}
