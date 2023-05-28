package attention.nowcoder;

import java.util.ArrayList;

/**
 * JZ3, <a href="https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&&tqId=11156&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking">...</a>
 */
public class JZ3 {

    /**
     * easy
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null) {
            return list;
        }
        ListNode head = new ListNode(0);
        ListNode temp = new ListNode(0);
        ListNode currentNode = new ListNode(0);

        while (listNode != null) {
            currentNode = listNode;
            listNode = listNode.next;
            head.next = currentNode;
            currentNode.next = temp;
            temp = head.next;
        }
        head = head.next;
        while (head.next != null) {
            System.out.println(head.val);
            list.add(head.val);
            head = head.next;
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        printListFromTailToHead(listNode1);
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }



}
