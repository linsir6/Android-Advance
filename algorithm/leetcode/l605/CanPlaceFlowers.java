package algorithm.leetcode.l605;

/**
 * <a href="https://leetcode.cn/problems/can-place-flowers/">...</a>
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i + 1 < flowerbed.length) {
                    if (flowerbed[i + 1] == 1) {
                        continue;
                    }
                }
                if (i - 1 >= 0) {
                    if (flowerbed[i - 1] == 1) {
                        continue;
                    }
                }
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 0, 0, 0, 1};
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        System.out.println(canPlaceFlowers.canPlaceFlowers(input, 2));
    }
}
