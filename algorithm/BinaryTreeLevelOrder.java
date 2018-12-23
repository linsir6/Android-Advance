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

    private static void binaryTreeLevelOrder(Node node) {
        if (node == null) {
            return;
        }
        LinkedList<Node> linkedList = new LinkedList<Node>();
        linkedList.add(node);
        while (linkedList.size() != 0) {
            Node temp = linkedList.pop();
            System.out.println(temp.value);
            if (temp.left != null) {
                linkedList.add(temp.left);
            }
            if (temp.right != null) {
                linkedList.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        binaryTreeLevelOrder(n1);
    }
}
