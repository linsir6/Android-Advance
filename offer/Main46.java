package offer;

public class Main46 {

    public int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n>0)&&((sum+=Sum_Solution(n-1))>0);
        return sum;
    }


    public static void main(String[] args) {
        Main46 main46 = new Main46();
        System.out.println(main46.Sum_Solution(4));

    }


}
