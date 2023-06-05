package algorithm.nowcoder;

/**
 * Jz1, https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&&tqId=11154&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class JZ1 {

    /**
     * Technique problem, if from the upper left corner the question will difficult
     * if from the lower left corner the question will easy, because if current number
     * less than target number, you only need move right,more than target number you
     * only need move up
     */
    public static boolean Find(int target, int[][] array) {
        if (array == null || array[0] == null) {
            return false;
        }
        int x = 0;
        int y = array[0].length - 1;
        while (x <= array.length - 1 && y >= 0) {
            if (array[x][y] == target) {
                return true;
            } else if (array[x][y] > target) {
                y--;
            } else {
                x++;
            }
        }


        return false;
    }

    public static void main(String[] args) {
        int[][] aar = new int[4][4];
        aar[0][0] = 1;
        aar[0][1] = 2;
        aar[0][2] = 8;
        aar[0][3] = 9;

        aar[1][0] = 2;
        aar[1][1] = 4;
        aar[1][2] = 9;
        aar[1][3] = 12;

        aar[2][0] = 4;
        aar[2][1] = 7;
        aar[2][2] = 10;
        aar[2][3] = 13;

        aar[3][0] = 6;
        aar[3][1] = 8;
        aar[3][2] = 11;
        aar[3][3] = 15;
        boolean result = Find(7, aar);
        System.out.println(result);
    }
}
