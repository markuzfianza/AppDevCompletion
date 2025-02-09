package hello;

import java.util.List;

public class MinMax {
   
    public static int[] solve(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : list) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[] { min, max };
    }
}
