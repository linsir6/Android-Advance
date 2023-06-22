package algorithm.leetcode.l142;

import algorithm.leetcode.l141.LinkedListCycle;

public class LinkedListCycleII {

    class ListNode {
        int val;
        ListNode next;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                while (slow != head){
                    slow = slow.next;
                    head = head.next;
                }
                return head;
            }
        }
        return null;
    }
}
