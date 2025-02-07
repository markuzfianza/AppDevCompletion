package hello;

import java.util.HashMap;

public class findOdd {
    public static int findIt(int [] a) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : a){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1 );
        }

        for (int num : countMap.keySet()) {
            if (countMap.get(num)* 2 != 0) {
                return num;
            }
        }
        return 0;
    }
}
