package offer;

public class Main44 {

    public boolean isContinuous(int[] numbers) {

        if (numbers.length != 5) {
            return false;
        }

        int[] d = new int[14];
        d[0] = -5;
        int len = numbers.length;
        int max = -1;
        int min = 14;
        for (int i = 0; i < len; i++) {
            d[numbers[i]]++;
            if (numbers[i] == 0) {
                continue;
            }
            if (d[numbers[i]] > 1) {
                return false;
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        if (max - min < 5) {
            return true;
        }
        return false;
    }


}
