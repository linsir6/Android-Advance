package algorithm.leetcode.l876;

public class MiddleOfTheLinkedList {


    public class ListNode {
        int val;
        ListNode next;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


}
