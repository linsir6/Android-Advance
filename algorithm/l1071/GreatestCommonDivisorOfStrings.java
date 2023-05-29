package attention.l1071;

/**
 * <a href="https://leetcode.cn/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75">...</a>
 */
public class GreatestCommonDivisorOfStrings {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int length = gcd(str1.length(), str2.length());
        return str1.substring(0, length);
    }


    public int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1;
            num1 = num2;
            num2 = temp % num2;
        }
        return num1;
    }


    public static void main(String[] args) {
        GreatestCommonDivisorOfStrings greatestCommonDivisorOfStrings = new GreatestCommonDivisorOfStrings();
        System.out.println(greatestCommonDivisorOfStrings.gcdOfStrings("ABCABC", "ABC"));
    }


}
