package algorithm.leetcode.l1431;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> results = new ArrayList<>();
        int currentGreatestNumber = 0;
        for (int i = 0; i < candies.length; i++) {
            currentGreatestNumber = Math.max(currentGreatestNumber, candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies < currentGreatestNumber) {
                results.add(false);
            } else {
                results.add(true);
            }
        }
        return results;
    }


}
