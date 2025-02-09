package hello;

public class Dinglemouse {
    public static int[] convertHumanToAnimalYears(final int humanYears) {
        int catYears, dogYears;

        catYears = switch (humanYears) {
            case 1 -> 15;
            case 2 -> 24;
            default -> 24 + (humanYears - 2) * 4;
        };

        dogYears = switch (humanYears) {
            case 1 -> 15;
            case 2 -> 24;
            default -> 24 + (humanYears - 2) * 5;
        };

        return new int[]{humanYears, catYears, dogYears};
    }
}
