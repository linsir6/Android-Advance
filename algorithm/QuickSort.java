public class QuickSort {
    public static void quickSort(int[] arr, int begin, int end) {
        int tBegin = begin;
        int tEnd = end;
        int mid = arr[tBegin];

        while (tBegin < tEnd) {
            while (tBegin < tEnd && arr[tEnd] >= mid) {
                tEnd--;
            }
            arr[tBegin] = arr[tEnd];
            while (tBegin < tEnd && arr[tBegin] <= mid) {
                tBegin++;
            }
            arr[tEnd] = arr[tBegin];
        }
        arr[tBegin] = mid;
        if (begin < tEnd) {
            quickSort(arr, begin, tEnd - 1);
        }
        if (tEnd < end) {
            quickSort(arr, tEnd + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 7, 6, 2, 1, 3};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }
    }
}
