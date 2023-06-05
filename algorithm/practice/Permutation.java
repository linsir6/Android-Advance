package algorithm.practice;

import java.util.ArrayList;

public class Permutation {

    public void permutation(int[] numbers) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        build(numbers, 0, result);
        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
            System.out.println();
        }
    }

    public void build(int[] arr, int begin, ArrayList<ArrayList<Integer>> result) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        result.add(list);
        for (int i = begin; i < arr.length; i++) {
            swap(arr, begin, i);
            build(arr, begin + 1, result);
            swap(arr, i, begin);
        }
    }

    public void swap(int array[], int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
