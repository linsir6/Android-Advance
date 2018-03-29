package offer;


public class ListNode {

    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }


    public void print() {
        ListNode h1 = this;
        while (h1.next != null) {
            System.out.print(h1.val + "\t");
            h1 = h1.next;
        }
        System.out.println();
    }

}
