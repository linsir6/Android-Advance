package offer;

public class Main13 {


    public ListNode FindKthToTail(ListNode head, int k) {
        if (k <= 0) return null;
        ListNode p1 = head;
        ListNode p2 = head;

        for (int i = 0; i < k - 1; i++) {
            if (p2 == null) return null;
            p2 = p2.next;
        }
        if (p2 == null) return null;
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);


        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        Main13 main13 = new Main13();
        System.out.println(main13.FindKthToTail(l1, 5).val);
    }

}














