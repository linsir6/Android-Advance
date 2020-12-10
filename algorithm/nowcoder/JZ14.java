package nowcoder;

/**
 * JZ14, https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ14 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ListNode FindKthToTail(ListNode head, int k) {
            if (head == null) {
                return null;
            }
            ListNode l1 = new ListNode(0);
            l1.next = head;
            ListNode result = head;
            for (int i = 0; i < k ; i++) {
                if(l1.next == null){
                    return null;
                }
                l1 = l1.next;
            }
            while (l1.next != null) {
                result = result.next;
                l1 = l1.next;
            }
            return result;
        }
    }

}
