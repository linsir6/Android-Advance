package offer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main21 {


    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        LinkedList<TreeNode> linkedList = new LinkedList<TreeNode>();
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        linkedList.add(root);
        while (!linkedList.isEmpty()) {
            TreeNode temp = linkedList.pop();
            list.add(temp.val);
            if (temp.left != null) {
                linkedList.add(temp.left);
            }
            if (temp.right != null) {
                linkedList.add(temp.right);
            }
        }

        return list;
    }


}
