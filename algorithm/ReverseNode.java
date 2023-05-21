package attention;

public class ReverseNode {

    static class Node {
        Node next;
        int value;

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }

    }

    public static Node reverse(Node head) {
        if (head == null) {
            return null;
        }
        Node result = new Node(null, 0);
        Node cur = head;
        while (cur != null) {
            Node temp = cur;
            cur = cur.next;
            temp.next = result.next;
            result.next = temp;
        }
        return result.next;
    }


    public static void main(String[] args) {
        Node node1 = new Node(null, 1);
        Node node2 = new Node(node1, 2);
        Node node3 = new Node(node2, 3);
        Node node4 = new Node(node3, 4);
        Node node5 = new Node(node4, 5);
        print(node5);
        print(reverse(node5));
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.value + "\t");
            head = head.next;
        }
        System.out.println();
    }


}
