package nowcoder;

/**
 * JZ7,https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ7 {
    public int Fibonacci(int n) {
        if(n == 1){
            return 1;
        }
        int a = 0;
        int b = 1;
        int result = 0;
        for (int i = n; i >= 2; i--) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    public static void main(String[] args) {
        JZ7 jz7 = new JZ7();
        int zz = jz7.Fibonacci(2);
        System.out.println(zz);
    }

}
