package hello;

import java.util.ArrayList;
import java.util.List;

class DoubleLinear {
    
    public static int dblLinear(int n) {
        List<Integer> u = new ArrayList<>();
        u.add(1);

        int i = 0, j = 0;

        for (int k = 0; k < n; k++) {
            int y = 2 * u.get(i) + 1;
            int z = 3 * u.get(j) + 1;

            int next;
            if (y < z) {
                next = y;
                i++;
            } else if (y > z) {
                next = z;
                j++;
            } else {
                next = y;
                i++;
                j++;
            }

            u.add(next);
        }

        return u.get(n);
    }
}
