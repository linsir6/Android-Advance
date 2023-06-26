package algorithm.leetcode.l141;

public class LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;
    }


    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }

}
