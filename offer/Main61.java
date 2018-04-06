package offer;

public class Main61 {

    int index = 0; //计数器

    TreeNode KthNode(TreeNode root, int k) {
        if (root != null) { //中序遍历寻找第k个
            TreeNode node = KthNode(root.left, k);
            if (node != null)
                return node;
            index++;
            if (index == k)
                return root;
            node = KthNode(root.right, k);
            if (node != null)
                return node;
        }
        return null;
    }

    public static void main(String[] args) {
        My my = new My();
        System.out.println(++my.i);
        My my2 = new My();
        System.out.println(++my2.i);
    }


    static class My {
        public static int i = 0;
    }

}
