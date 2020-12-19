package nowcoder;

import java.util.ArrayList;

/**
 * JZ19, https://www.nowcoder.com/practice/9b4c81a02cd34f76be2659fa0d54342a?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ19 {

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int r1 = 0;
        int r2 = matrix.length - 1;

        int c1 = 0;
        int c2 = matrix[0].length - 1;

        while (r1 <= r2 && c1 <= c2) {
            for (int i = c1; i <= c2; i++) {
                result.add(matrix[r1][i]);
            }
            for (int i = r1 + 1; i <= r2; i++) {
                result.add(matrix[i][c2]);
            }
            if (r1 != r2) {
                for (int i = c2 - 1; i >= c1; i--) {
                    result.add(matrix[r2][i]);
                }
            }
            if (c1 != c2) {
                for (int i = r2 - 1; i > r1; i--) {
                    result.add(matrix[i][c1]);
                }
            }

            r1++;
            c1++;
            r2--;
            c2--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = new int[5][];
        arr[0] = new int[]{1};
        arr[1] = new int[]{2};
        arr[2] = new int[]{3};
        arr[3] = new int[]{4};
        arr[4] = new int[]{5};

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
