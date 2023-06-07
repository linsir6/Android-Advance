package algorithm.leetcode.l790;

/**
 * <a href="https://leetcode.cn/problems/domino-and-tromino-tiling/solution/gong-shui-san-xie-by-ac_oier-kuv4/">...</a>
 */
public class DominoAndTrominoTiling {

    int MOD = (int) (1e9 + 7);

    public int numTilings(int n) {
        int[][] f = new int[n + 1][4];
        f[1][0] = f[1][1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i][0] = f[i - 1][1];
            int cur = 0;
            for (int j = 0; j < 4; j++) cur = (cur + f[i - 1][j]) % MOD;
            f[i][1] = cur;
            f[i][2] = (f[i - 1][0] + f[i - 1][3]) % MOD;
            f[i][3] = (f[i - 1][0] + f[i - 1][2]) % MOD;
        }
        return f[n][1];
    }

}
