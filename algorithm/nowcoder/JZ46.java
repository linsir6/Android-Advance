package nowcoder;

/**
 * JZ46, https://www.nowcoder.com/practice/f78a359491e64a50bce2d89cff857eb6?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ46 {
    public int LastRemaining_Solution(int n, int m) {
        if (n <= 0) return -1;
        int index = 0;
        for (int i = 2; i <= n; ++i) {
            index = (index + m) % i;
        }
        return index;
    }
}
