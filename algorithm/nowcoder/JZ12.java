package nowcoder;

/**
 * JZ12, https://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 */
public class JZ12 {

    public double Power(double base, int exponent) {
        double res = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            res = base * res;
        }
        if (exponent > 0) {
            return res;
        } else {
            return 1 / res;
        }

    }

}
