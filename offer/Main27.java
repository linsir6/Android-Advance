package offer;

public class Main27 {

    public int MoreThanHalfNum_Solution(int[] array) {

        int result = array[0];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (result == array[i]) {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    result = array[i];
                    count = 1;
                }
            }
        }

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == result) {
                temp++;
            }
        }

        if (temp > array.length / 2){
            return result;
        }else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Main27 test = new Main27();
        int[] arr = {1, 1, 1, 1, 2, 2, 2, 2, 2, 3};
        System.out.println(test.MoreThanHalfNum_Solution(arr));
    }


}
