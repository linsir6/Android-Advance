package offer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main59 {

    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        if(pRoot == null)
            return ret;
        q.add(pRoot);
        int now = 1, next = 0;
        while(!q.isEmpty()) {
            TreeNode t = q.remove();
            now--;
            tmp.add(t.val);
            if(t.left != null) {
                q.add(t.left);
                next++;
            }
            if(t.right != null) {
                q.add(t.right);
                next++;
            }
            if(now == 0) {
                ret.add(new ArrayList<Integer>(tmp));
                tmp.clear();
                now = next;
                next = 0;
            }
        }
        return ret;
    }

}
