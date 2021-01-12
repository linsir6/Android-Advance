package nowcoder;

public class JZ47 {
    public int Add(int num1, int num2) {
        int result = 0;
        int carry = 0;
        do {
            result = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = result;
            num2 = carry;
        } while (carry != 0);
        return result;
    }

    public static void main(String[] args) {
        JZ47 jz47 = new JZ47();
        jz47.Add(2, 3);
    }

}
