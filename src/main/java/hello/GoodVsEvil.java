package hello;

public class GoodVsEvil {

    public static String determineBattleOutcome(String goodAmounts, String evilAmounts) {
        int[] goodWorth = {1, 2, 3, 3, 4, 10};
        int[] evilWorth = {1, 2, 2, 2, 3, 5, 10};

        int good = calculateScore(goodAmounts, goodWorth);
        int evil = calculateScore(evilAmounts, evilWorth);

        if (good == -1 || evil == -1) {
            return "Invalid input: Please ensure proper formatting.";
        }

        if (good > evil) {
            return "Battle Result: Good triumphs over Evil";
        } else if (good < evil) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return "Battle Result: No victor on this battle field";
        }
    }

    private static int calculateScore(String amounts, int[] worth) {
        String[] values = amounts.split(" ");
        if (values.length != worth.length) {
            return -1; // Input validation failed
        }

        int totalScore = 0;
        for (int i = 0; i < values.length; i++) {
            try {
                totalScore += Integer.parseInt(values[i]) * worth[i];
            } catch (NumberFormatException e) {
                return -1; // Handle invalid input (non-numeric values)
            }
        }
        return totalScore;
    }
}
