package attention.nowcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * JZ19, https://www.nowcoder.com/practice/9b4c81a02cd34f76be2659fa0d54342a?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ19 {

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int x1 = 0;
        int x2 = matrix[0].length - 1;

        int y1 = 0;
        int y2 = matrix.length - 1;

        while (x1 <= x2 && y1 <= y2) {
            for (int i = x1; i <= x2; i++) {
                result.add(matrix[y1][i]);
            }
            for (int i = y1 + 1; i <= y2; i++) {
                result.add(matrix[i][x2]);
            }
            if (y1 != y2) {
                for (int i = x2 - 1; i >= x1; i--) {
                    result.add(matrix[y2][i]);
                }
            }
            if (x1 != x2) {
                for (int i = y2 - 1; i >= y1 + 1; i--) {
                    result.add(matrix[i][x1]);
                }
            }
            x1++;
            x2--;
            y1++;
            y2--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        List<Integer> list = printMatrix(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}

