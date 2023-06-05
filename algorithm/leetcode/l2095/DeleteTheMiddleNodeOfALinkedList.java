package algorithm.leetcode.l2095;

public class DeleteTheMiddleNodeOfALinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = new ListNode(0);
        slow.next = head;

        while (fast.next != null) {
            if (fast.next.next != null) {
                fast = fast.next.next;
            } else {
                fast = fast.next;
            }
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(7);
        ListNode l5 = new ListNode(1);
        ListNode l6 = new ListNode(2);
        ListNode l7 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

//        while (l1.next != null) {
//            System.out.println(l1.val);
//            l1 = l1.next;
//        }

        DeleteTheMiddleNodeOfALinkedList deleteTheMiddleNodeOfALinkedList = new DeleteTheMiddleNodeOfALinkedList();
        ListNode node = deleteTheMiddleNodeOfALinkedList.deleteMiddle(l1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

}
