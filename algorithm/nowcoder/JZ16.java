package nowcoder;

public class JZ16 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ListNode Merge(ListNode list1, ListNode list2) {
            ListNode result = new ListNode(0);
            ListNode cur = result;
            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    cur.next = list1;
                    cur = cur.next;
                    list1 = list1.next;
                } else {
                    cur.next = list2;
                    cur = cur.next;
                    list2 = list2.next;
                }
            }
            if (list1 == null) {
                cur.next = list2;
            }
            if (list2 == null) {
                cur.next = list1;
            }
            return result.next;
        }
    }
}
