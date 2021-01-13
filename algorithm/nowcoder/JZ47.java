package nowcoder;

public class JZ47 {

    public int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }

    public static void main(String[] args) {
        JZ47 jz47 = new JZ47();
        System.out.println(jz47.Sum_Solution(4));
    }

}
