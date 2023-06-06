package algorithm.leetcode.l1137;

public class NThTribonacciNumber {

    //0 1 1 2 4 8
    public int tribonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int p = 0;
        int q = 1;
        int r = 1;
        int result = 0;

        for (int i = 2; i < n; i++) {
            result = p + q + r;
            p = q;
            q = r;
            r = result;

        }
        return result;
    }


    public static void main(String[] args) {
        NThTribonacciNumber tribonacci = new NThTribonacciNumber();
        System.out.printf(tribonacci.tribonacci(4) + "");
    }

}
