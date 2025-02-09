package hello;

import java.util.List;

public class MinMax {
   
    public static int[] solve(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Invalid input: List must not be null or empty");
        }

        int min = list.get(0);
        int max = list.get(0);

        for (int num : list) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        return new int[]{min, max};
    }
}
