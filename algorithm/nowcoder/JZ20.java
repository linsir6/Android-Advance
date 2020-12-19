package nowcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * JZ20, https://www.nowcoder.com/practice/4c776177d2c04c2494f2555c9fcc1e49?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ20 {

    private static List<Integer> list = new ArrayList<>();
    private static List<Integer> minList = new ArrayList<>();

    public void push(int node) {
        list.add(node);
        if (minList.isEmpty()) {
            minList.add(node);
        } else {
            if (node < minList.get(minList.size() - 1)) {
                minList.add(node);
            } else {
                minList.add(minList.get(minList.size() - 1));
            }
        }
    }

    public void pop() {
        list.remove(list.size() - 1);
        minList.remove(minList.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int min() {
        return minList.get(list.size() - 1);
    }

    public static void main(String[] args) {
        JZ20 jz20 = new JZ20();
        jz20.push(1);
        System.out.println(jz20.min());
        jz20.push(2);
        jz20.push(3);
        System.out.println(jz20.min());
        jz20.pop();
        jz20.pop();
        System.out.println(jz20.min());
        jz20.pop();
        jz20.push(3100);
        System.out.println(jz20.min());
    }
}
