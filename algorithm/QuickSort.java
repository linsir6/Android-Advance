package attention;

import java.util.Arrays;

public class QuickSort2 {


    public static void quickSort(int[] a, int begin, int end) {
    
        int tbegin = begin;
        int tend = end;
        int mid = a[begin];

        while (tbegin < tend) {
            while (tbegin < tend && a[tend] >= mid) {
                tend--;
            }
            a[tbegin] = a[tend];

            while (tbegin < tend && a[tbegin] <= mid) {
                tbegin++;
            }
            a[tend] = a[tbegin];
        }

        a[tbegin] = mid;

        if (begin < tend) {
            quickSort(a, begin, tend - 1);
        }
        if (tend < end) {
            quickSort(a, tend + 1, end);
        }


    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 1, 6, 7, 8, 5, 3, 5};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }


}
