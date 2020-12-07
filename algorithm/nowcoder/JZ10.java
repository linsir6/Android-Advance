package nowcoder;

/**
 * JZ10, https://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ10 {

    public int RectCover(int target) {
        if (target <= 0) {
            return 0;
        } else if (target <= 2) {
            return target;
        } else {
            return RectCover(target - 1) + RectCover(target - 2);
        }
    }
}
