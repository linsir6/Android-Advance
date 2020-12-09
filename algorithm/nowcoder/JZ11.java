package nowcoder;

/**
 * JZ11, https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ11 {

    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
            System.out.println(n);
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(NumberOf1(n));
    }
}
