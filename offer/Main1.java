package offer;

public class Main1 {


    public boolean Find(int target, int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }

        int i = array.length;
        int j = array[0].length;

        int m = i - 1;
        int n = 0;

        while (m >= 0 && n < j) {
            if (array[m][n] == target) {
                return true;
            } else if (array[m][n] > target) {
                m--;
            } else {
                n++;
            }
        }
        return false;

    }


}
