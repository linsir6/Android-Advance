package nowcoder;

/**
 * JZ8 , https://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ8 {

    public int JumpFloor(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int a = 1;
        int b = 2;

        int result = 0;
        for (int i = 2; i < target; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    public static void main(String[] args) {
        JZ8 jz8 = new JZ8();
        System.out.println(jz8.JumpFloor(4));
    }
}
