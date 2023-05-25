package attention;

public class PrintLastK {

    static class Node {
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    private static int findLastK(Node node, int k) {
        if (node == null) {
            return -1;
        }
        Node fastPointer = node;
        Node slowPointer = node;

        for (int i = 0; i < k; i++) {
            fastPointer = fastPointer.next;
        }

        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer.value;
    }


    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        System.out.println(findLastK(n1, 3));
    }


}
