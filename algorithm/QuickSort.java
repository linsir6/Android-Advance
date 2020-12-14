public class QuickSort {
    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[begin];
        while (begin < end) {
            while (begin < end && arr[end] >= pivot) {
                end--;
            }
            arr[begin] = arr[end];
            while (begin < end && arr[begin] <= pivot) {
                begin++;
            }
            arr[end] = arr[begin];
        }
        arr[begin] = pivot;
        return begin;
    }


    public static void main(String[] args) {
        int[] arr = {8, 5, 7, 6, 2, 1, 3};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }
    }
}
