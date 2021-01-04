package nowcoder;

public class JZ40 {

    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (null == array) return;
        int _OR = 0;
        for (int temp : array) {
            _OR ^= temp;
        }
        int classify = _OR & (-_OR);
        for (int temp : array) {
            int condition = temp & classify;
            if (condition == 0) {
                num1[0] ^= temp;
            } else num2[0] ^= temp;
        }
    }

}
