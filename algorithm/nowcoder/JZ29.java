package nowcoder;

import java.util.ArrayList;

/**
 * JZ29, https://www.nowcoder.com/practice/6a296eb82cf844ca8539b57c23e6e9bf?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ29 {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 1, 6, 2, 7, 3, 8};
        JZ29 jz29 = new JZ29();
        jz29.GetLeastNumbers_Solution(arr, 4);
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (k > input.length) {
            return list;
        }
        for (int i = input.length / 2 - 1; i >= 0; i--) {
            adjustHeap(input, i, input.length);
        }

        for (int i = input.length - 1; i >= input.length - k; i--) {
            list.add(input[0]);
            System.out.print(input[0] + "\t");
            swap(input, 0, i);
            adjustHeap(input, 0, i);
        }
        return list;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];
        for (int k = i * 2 + 1; k + 1 <= length; k = k * 2 + 1) {
            if (k + 1 < length && arr[k] > arr[k + 1]) {
                k++;
            }
            if (arr[k] < temp) {
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        arr[i] = temp;
    }
}
