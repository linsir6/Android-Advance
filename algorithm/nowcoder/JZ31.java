package nowcoder;

public class JZ31 {

    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp > 0) {
                if (temp % 10 == 1) {
                    count++;
                }
                temp = temp / 10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //13->6
        JZ31 jz31 = new JZ31();
        System.out.println(jz31.NumberOf1Between1AndN_Solution(13));


    }


}
