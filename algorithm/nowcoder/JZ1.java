package nowcoder;

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
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }
        int x = 0;
        int y = array[0].length - 1;
        while (x < array[0].length && y >= 0) {
            if (array[x][y] == target) {
                return true;
            } else if (array[x][y] < target) {
                x++;
            } else {
                y--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] aar = new int[2][2];
        aar[0][0] = 1;
        aar[0][1] = 3;
        aar[1][0] = 2;
        aar[1][1] = 4;
        boolean result = Find(3, aar);
        System.out.println(result);
    }
}
