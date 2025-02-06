package hello;

public class sumOfSequence {
    
    public static int sequenceSum(int start, int end, int step) {
        if (start > end){
            return 0;
        }

        int totalSum = 0;

        for (int i = start; i <= end; i += step){
            totalSum += i;
        }

        return totalSum;
    }
}
