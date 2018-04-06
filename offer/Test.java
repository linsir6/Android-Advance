package offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(Math.pow(2,32)/2-1);
        System.out.println(Integer.MAX_VALUE);
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
