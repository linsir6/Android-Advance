package algorithm.leetcode.l328;

public class OddEvenLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }


    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode oddHead = head;
        ListNode eventHead = head.next;
        ListNode even = eventHead;
        while (even != null && even.next != null) {
            oddHead.next = even.next;
            oddHead = oddHead.next;
            even.next = oddHead.next;
            even = even.next;
        }
        oddHead.next = eventHead;
        return head;
    }

    //1 -> 2 -> 3 -> 4 ->5 -> 6


    //eventHead = 2
    //odd = 1   event = 2
    //1 -> 3 odd = 3
    //2 -> 4 even = 4
}
