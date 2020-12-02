package nowcoder;

/**
 * JZ6, https://www.nowcoder.com/practice/9f3231a991af4f55b95579b44b7a01ba?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ6 {

    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return Math.min(array[0], array[i]);
            }
        }
        return array[0];
    }

    public int minNumberInRotateArray2(int [] array) {
        int low = 0 ;
        int high = array.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }
        }
        return array[low];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{
                3, 4, 5, 1, 2
        };
        JZ6 jz6 = new JZ6();
        int result = jz6.minNumberInRotateArray(arr);
        System.out.println(result);
    }
}
