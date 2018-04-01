package offer;

public class Main15 {

    public static ListNode Merge(ListNode list1, ListNode list2) {

        if (list1 == null)
            return list2;

        if (list2 == null)
            return list1;

        ListNode head = new ListNode(1);
        ListNode cur = head;

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

        if (list1 != null) {
            while (list1 != null) {
                cur.next = list1;
                cur = cur.next;
                list1 = list1.next;
            }
        }


        if (list2 != null) {
            while (list2 != null) {
                cur.next = list2;
                cur = cur.next;
                list2 = list2.next;
            }
        }

        return head.next;
    }


    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(5);


        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(6);

        l1.next = l2;
        l2.next = l3;

        l4.next = l5;
        l5.next = l6;

        l1.print();
        Merge(l1, l4).print();

    }


}
