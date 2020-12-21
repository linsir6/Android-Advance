package nowcoder;

public class JZ23 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return verify(sequence, 0, sequence.length - 1);
    }

    public boolean verify(int[] sequence, int begin, int root) {
        if (begin >= root) {
            return true;
        }
        int j = begin;
        for (int i = begin; i < root; i++) {
            j = i;
            if (sequence[i] > sequence[root]) {
                break;
            }
        }
        for (int i = j + 1; i < root; i++) {
            if (sequence[i] < sequence[root]) {
                return false;
            }
        }
        return verify(sequence, begin, j - 1) && verify(sequence, j, root - 1);
    }

    public static void main(String[] args) {
        JZ23 jz23 = new JZ23();
        System.out.println(jz23.VerifySquenceOfBST(new int[]{4,6,7,5}));
    }
}
