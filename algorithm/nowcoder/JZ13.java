package nowcoder;

public class JZ13 {

    public void reOrderArray(int[] array) {
        int length = array.length;
        int orderOddNumberCount = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 == 1) {
                int j = i;
                while (j > orderOddNumberCount) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    j--;
                }
                orderOddNumberCount++;
            }
        }
    }


    public static void main(String[] args) {
        JZ13 jz13 = new JZ13();
        jz13.reOrderArray(new int[]{1, 2, 3});
        System.out.println(1);
    }
}
