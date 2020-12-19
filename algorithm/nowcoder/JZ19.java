package nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * JZ19, https://www.nowcoder.com/practice/9b4c81a02cd34f76be2659fa0d54342a?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ19 {

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int lBegin = 0;
        int lEnd = matrix[0].length;

        int cBegin = 0;
        int cEnd = matrix.length;

        while (lBegin <= lEnd && cBegin < cEnd) {
            for (int j = cBegin; j < cEnd; j++) {
                result.add(matrix[lBegin][j]);
            }
            for (int i = cBegin + 1; i < cEnd; i++) {
                result.add(matrix[i][cEnd - 1]);
            }
            for (int k = cEnd - 2; k >= lBegin && k < cEnd - 1; k--) {
                result.add(matrix[cEnd - 1][k]);
            }
            for (int l = lEnd - 2; l > lBegin && l < lEnd - 1; l--) {
                result.add(matrix[l][lBegin]);
            }
            lBegin++;
            cBegin++;
            lEnd--;
            cEnd--;
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
        ArrayList<Integer> list = printMatrix(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
//    ArrayList<Integer> temp = new ArrayList<>();
//    int r1 = 0;
//    int r2 = matrix.length-1;
//    int c1 = 0;
//    int c2 = matrix[0].length-1;
//       while(r1<=r2&&c1<=c2){
//               for(int i=c1;i<=c2;i++){
//               temp.add(matrix[r1][i]);
//               }
//               for(int i=r1+1;i<=r2;i++){
//               temp.add(matrix[i][c2]);
//               }
//               if(r1!=r2){
//               for(int i=c2-1;i>=c1;i--)
//               temp.add(matrix[r2][i]);
//               }
//               if(c1!=c2){
//               for(int i=r2-1;i>r1;i--)
//               temp.add(matrix[i][c1]);
//               }
//               r1++;
//               r2--;
//               c1++;
//               c2--;
//
//               }
//               return temp;
//               }
