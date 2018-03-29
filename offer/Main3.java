package offer;

import java.util.ArrayList;

public class Main3 {


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return list;
        }
        printListFromTailToHead(listNode.next);
        list.add(listNode.val);
        return list;
    }


    public static void main(String[] args) {

        ListNode l1 = new Main3().new ListNode(1);
        ListNode l2 = new Main3().new ListNode(2);
        ListNode l3 = new Main3().new ListNode(3);

        l1.next = l2;
        l2.next = l3;

        Main3 main3 = new Main3();
        main3.printListFromTailToHead(l1);
    }


}















