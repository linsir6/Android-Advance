package offer;

public class Main56 {

    public TreeLinkNode GetNext(TreeLinkNode node) {
        if (node == null) return null;
        if (node.right != null) {
            node = node.right;
            while (node.left != null) {
                node = node.left;

            }
            return node;
        }
        while (node.next != null) {
            if (node.next.left == node) return node.next;
            node = node.next;
        }
        return null;
    }

}
