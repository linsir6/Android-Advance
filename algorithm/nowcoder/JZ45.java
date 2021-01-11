package nowcoder;

import java.util.TreeSet;

/**
 * JZ45, https://www.nowcoder.com/practice/762836f4d43d43ca9deb273b3de8e1f4?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ45 {
    //[0,3,2,6,4]
    public boolean isContinuous(int[] numbers) {
        if (numbers.length != 5) {
            return false;
        }
        int num = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                num++;
            } else {
                set.add(numbers[i]);
            }
        }
        if ((num + set.size()) != 5) {
            return false;
        }
        if ((set.last() - set.first()) < 5) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(1);
        set.add(4);
        set.add(2);
        set.add(5);
        System.out.println(set.first());
        System.out.println(set.last());
    }
}
