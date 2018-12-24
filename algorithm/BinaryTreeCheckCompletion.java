import java.util.LinkedList;

public class BinaryTreeLevelOrder {

    static class Node {
        Node left;
        Node right;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    /**
     * 思想:首先利用的是层次遍历，两个判断条件
     * 1. 如果一个结点有右子树就一定要有左子树
     * 2. 如果已经出现了叶子结点，那么之后的所有结点都应该是叶子结点
     */
    private static boolean binaryTreeLevelOrder(Node node) {
        if (node == null) {
            return false;
        }
        LinkedList<Node> linkedList = new LinkedList<Node>();
        linkedList.add(node);
        boolean isHaveEmptyNode = false;
        while (linkedList.size() != 0) {
            Node temp = linkedList.pop();
            if (temp.left == null && temp.right == null) {
                isHaveEmptyNode = true;
            }
            if (isHaveEmptyNode && temp.left != null && temp.right != null) {
                return false;
            }

            if (temp.right != null && temp.left == null) {
                return false;
            }

            if (temp.left != null) {
                linkedList.add(temp.left);
            }
            if (temp.right != null) {
                linkedList.add(temp.right);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        System.out.println(binaryTreeLevelOrder(n1));
    }
}
