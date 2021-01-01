package nowcoder;

import java.util.List;

/**
 * JZ36, https://www.nowcoder.com/practice/6ab1d9a29e88450685099d45c9e31e46?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ36 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode h1 = pHead1;
        ListNode h2 = pHead2;
        while (h1 != h2) {
            if (h1 != null) {
                h1 = h1.next;
            } else {
                h1 = pHead2;
            }
            if (h2 != null) {
                h2 = h2.next;
            } else {
                h2 = pHead1;
            }
        }
        return h1;
    }

}
