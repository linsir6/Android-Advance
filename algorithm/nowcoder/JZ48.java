package nowcoder;

public class JZ48 {
    public int Add(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        JZ48 jz47 = new JZ48();
        jz47.Add(2, 3);
    }

}
