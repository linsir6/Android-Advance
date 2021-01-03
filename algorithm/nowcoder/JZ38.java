package nowcoder;

/**
 * JZ38, https://www.nowcoder.com/practice/435fb86331474282a3499955f0a41e8b?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ38 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = TreeDepth(root.left) > TreeDepth(root.right)
                ? TreeDepth(root.left) + 1 : TreeDepth(root.right) + 1;
        return depth;
    }

}
