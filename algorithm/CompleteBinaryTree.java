package algorithm;

import java.util.LinkedList;

public class CompleteBinaryTree {

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
    private static boolean isCompleteBinaryTree(Node node) {
        if (node == null){
            return false;
        }
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);
        boolean alreadyHaveLeafNode = false;

        while (queue.size() != 0){
            Node temp = queue.pop();
            if (temp.left == null && temp.right == null){
                alreadyHaveLeafNode = true;
            }
            if (alreadyHaveLeafNode && (temp.left != null || temp.right != null)){
                return false;
            }
            if (temp.left == null && temp.right != null){
                return false;
            }
            if (temp.left != null){
                queue.add(temp.left);
            }
            if (temp.right != null){
                queue.add(temp.right);
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
        n2.left = n4;
        n2.right = n5;
        System.out.println(isCompleteBinaryTree(n1));
    }
}
