package nowcoder;

import java.util.HashMap;
import java.util.Map;

/**
 * JZ25, https://www.nowcoder.com/practice/f836b2c43afc4b35ad6adc41ec941dba?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ25 {

    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }


    public class Solution {
        public RandomListNode Clone(RandomListNode pHead) {
            if (pHead == null) return null;
            RandomListNode head = new RandomListNode(pHead.label);
            RandomListNode tempPHead = pHead;
            RandomListNode tail = head;

            Map<RandomListNode, RandomListNode> map = new HashMap<>();
            while (pHead!= null) {
                map.put(pHead, new RandomListNode(pHead.label));
                pHead = pHead.next;
            }
            while (tempPHead != null) {
                tail.next = map.get(tempPHead.next);
                tail.random = map.get(tempPHead.random);
                tail = tail.next;
                tempPHead = tempPHead.next;
            }

            return head;
        }
    }

}
