package offer;

public class Main32 {

    public int GetUglyNumber_Solution(int index) {

        if (index <= 0)
            return 0;
        int[] result = new int[index];
        int count = 0;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;

        result[0] = 1;
        int tmp = 0;
        while (count < index - 1) {
            tmp = min(result[i2] * 2, min(result[i3] * 3, result[i5] * 5));
            if (tmp == result[i2] * 2) i2++;//三条if防止值是一样的，不要改成else的
            if (tmp == result[i3] * 3) i3++;
            if (tmp == result[i5] * 5) i5++;
            result[++count] = tmp;
        }
        return result[index - 1];
    }

    private int min(int a, int b) {
        return (a > b) ? b : a;
    }
}
