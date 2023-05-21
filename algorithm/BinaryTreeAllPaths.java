package attention;


import java.util.ArrayList;
import java.util.List;

public class BinaryTreeAllPaths {

    static class Node {
        int val;
        Node left;
        Node right;
    }


    static List<List<Integer>> paths = new ArrayList<>();

    public static void getAllPath(Node head, List<Integer> path) {
        if (head == null) {
            return;
        }
        if (head.left == null && head.right == null) {
            paths.add(path);
        }else {
            if (head.left != null) {
                List<Integer> copyPath = new ArrayList<>(path);
                copyPath.add(head.left.val);
                getAllPath(head.left, copyPath);
            }
            if (head.right != null) {
                List<Integer> copyPath = new ArrayList<>(path);
                copyPath.add(head.right.val);
                getAllPath(head.right, copyPath);
            }
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node();
        node1.val = 1;
        Node node2 = new Node();
        node2.val = 2;
        Node node3 = new Node();
        node3.val = 3;
        Node node4 = new Node();
        node4.val = 4;
        Node node5 = new Node();
        node5.val = 5;

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;


        List<Integer> path = new ArrayList<>();
        path.add(1);
        getAllPath(node1, path);
        System.out.println(paths.size());

        for (int i = 0; i < paths.size(); i++) {
            for (int j = 0; j < paths.get(i).size(); j++) {
                System.out.print(paths.get(i).get(j) + "\t");
            }
            System.out.println();
        }
    }


}
