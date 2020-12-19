package nowcoder;

/**
 * JZ16, https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
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
