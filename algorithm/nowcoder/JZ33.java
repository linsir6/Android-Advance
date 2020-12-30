package nowcoder;

/**
 * JZ33, https://www.nowcoder.com/practice/6aa9e04fc3794f68acf8778237ba065b?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ33 {
    public int GetUglyNumber_Solution(int index) {
        if (index == 0) {
            return 0;
        }
        int[] result = new int[index];
        result[0] = 1;
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        for (int i = 1; i < index; i++) {
            result[i] = Math.min(result[p2] * 2, Math.min(result[p3] * 3, result[p5] * 5));
            System.out.print(result[i] + "\t");
            if (result[i] == result[p2] * 2) p2++;
            if (result[i] == result[p3] * 3) p3++;
            if (result[i] == result[p5] * 5) p5++;
        }
        System.out.println();
        return result[index - 1];
    }

    public static void main(String[] args) {
        JZ33 jz33 = new JZ33();
        System.out.println(jz33.GetUglyNumber_Solution(7));
    }
}
