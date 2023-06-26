package algorithm.leetcode.l19;

public class RemoveNthNodeFromEndOfList {

    public class ListNode {
        int val;
        ListNode next;
    }

    //1 -> 2 -> 3 -> 4 -> 5
    //dummy -> 1 -> 2 -> 3 -> 4 -> 5
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode right = dummy;
        ListNode left = dummy;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }
        while (right.next != null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return dummy.next;
    }


}
