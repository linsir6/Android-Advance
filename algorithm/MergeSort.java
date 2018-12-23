public class MergeSort {

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[t++] = arr[i++];
        }
        while (j <= right) {
            temp[t++] = arr[j++];
        }
        t = 0;
        while (left <= right) {
            arr[left++] = temp[t++];
        }
    }

    private static void sort(int[] arr, int l, int r, int[] temp) {
        if (l < r) {
            int mid = (l + r) / 2;
            sort(arr, l, mid, temp);
            sort(arr, mid + 1, r, temp);
            merge(arr, temp, l, mid, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 7, 6, 2, 1, 3};
        sort(arr, 0, arr.length - 1, new int[arr.length]);
        for (int temp : arr) {
            System.out.println(temp + "  ");
        }
    }


}
