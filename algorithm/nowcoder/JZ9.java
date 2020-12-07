package nowcoder;

/**
 * JZ9 , https://www.nowcoder.com/practice/22243d016f6b47f2a6928b4313c85387?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ9 {

    public int JumpFloorII(int target) {
        if (target <= 0) {
            return -1;
        } else if (target == 1) {
            return 1;
        } else {
            return 2 * JumpFloorII(target - 1);
        }
    }


    public static void main(String[] args) {
        JZ9 jz9 = new JZ9();
        System.out.println(jz9.JumpFloorII(3));
    }
}
