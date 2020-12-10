package nowcoder;

public class JZ15 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ListNode ReverseList(ListNode head) {
            ListNode l1 = head;
            ListNode newHead = new ListNode(0);
            ListNode temp = null;
            while (l1 != null){
                temp = newHead.next;
                newHead.next = l1;
                l1 = l1.next;
                newHead.next.next = temp;
            }
            return newHead.next;
        }
    }
}
