package offer;

public class Main14 {


    public static ListNode ReverseList(ListNode head) {

        ListNode cur = null;
        ListNode pre = head;
        ListNode temp;

        while (pre != null) {
            temp = pre.next;
            pre.next = cur;
            cur = pre;
            pre = temp;
        }

        return cur;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        l1.print();
        ReverseList(l1).print();


    }
}
