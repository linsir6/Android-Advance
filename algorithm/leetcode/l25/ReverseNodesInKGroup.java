package algorithm.leetcode.l25;

public class ReverseNodesInKGroup {


    public class ListNode {
        int val;
        ListNode next;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        int n = 0;
        ListNode cur = head;
        while (cur != null) {
            n++;
            cur = cur.next;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode p0 = dummy;
        ListNode pre = null;

        cur = p0.next;
        while (n >= k) {
            n = n - k;
            for (int i = 0; i < k; i++) {
                ListNode next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            ListNode next = p0.next;
            p0.next.next = cur;
            p0.next = pre;
            p0 = next;
        }
        return dummy.next;
    }


}
