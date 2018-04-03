package offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //getSubArrays(new int[]{10, 20, 30, 40, 50}, 100);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(in.nextInt());
        }
    }


    public static void getSubArrays(int[] nums, int all) {
        int count = (int) Math.pow(2, nums.length);
        for (int i = 1; i < count; i++) {
            List<Integer> subarray = new ArrayList<Integer>();
            int temp = i;
            int index = 0;
            while (temp != 0) {
                if ((temp & 1) == 1) {
                    subarray.add(nums[index]);
                }
                index++;
                temp = temp >> 1;
            }
            for (int j = 0; j < subarray.size(); j++) {
                temp += subarray.get(j);
            }
            if (temp == all) {
                System.out.println("perfect");
                return;
            }
        }
        System.out.println("good");

    }

}
