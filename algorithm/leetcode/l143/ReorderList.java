package algorithm.leetcode.l143;

import java.util.List;

public class ReorderList {

    public class ListNode {
        int val;
        ListNode next;
    }


    public void reorderList(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode head2 = reverseNode(mid);

        while (head2.next != null){
            ListNode next = head.next;
            ListNode next2 = head2.next;

            head.next = head2;
            head2.next = next;

            head = next;
            head2 = next2;
        }
    }

    //链表的中间节点
    private ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //反转链表
    private ListNode reverseNode(ListNode head){
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
