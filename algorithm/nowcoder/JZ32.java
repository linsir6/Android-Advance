package nowcoder;

/**
 * JZ32, https://www.nowcoder.com/practice/8fecd3f8ba334add803bf2a06af1b993?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ32 {

    public String permutation(int[] numbers) {
        if (numbers == null || numbers.length == 0) return "";
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum1 = Integer.parseInt(numbers[i] + "" + numbers[j]);
                int sum2 = Integer.parseInt(numbers[j] + "" + numbers[i]);
                if (sum1 > sum2) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for (int number : numbers) str.append(number);
        return str.toString();
    }

}
