package algorithm.leetcode.l82;

public class RemoveDuplicatedFromSortListsII {


    public class ListNode {
        int val;
        ListNode next;
    }


    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode cur = dummy;

        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int value = cur.next.val;
                while (cur.next != null && cur.next.val == value) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

}
