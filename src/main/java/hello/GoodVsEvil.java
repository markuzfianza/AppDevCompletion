package hello;

public class GoodVsEvil {

    public static String battle(String goodAmounts, String evilAmounts) {
        String[] inputGood = goodAmounts.split(" ");
        String[] inputEvil = evilAmounts.split(" ");

        int hobbit = Integer.parseInt(inputGood[0]) * 1;
        int men = Integer.parseInt(inputGood[1]) * 2;
        int elves = Integer.parseInt(inputGood[2]) * 3;
        int dwarves = Integer.parseInt(inputGood[3]) * 3;
        int eagles = Integer.parseInt(inputGood[4]) * 4;
        int wizard = Integer.parseInt(inputGood[5]) * 10;

        int good = hobbit + men + elves + dwarves + eagles + wizard;

        int orcs = Integer.parseInt(inputEvil[0]) * 1;
        int evilMen = Integer.parseInt(inputEvil[1]) * 2;
        int wargs = Integer.parseInt(inputEvil[2]) * 2;
        int goblin = Integer.parseInt(inputEvil[3]) * 2;
        int urukHai = Integer.parseInt(inputEvil[4]) * 3;
        int trolls = Integer.parseInt(inputEvil[5]) * 5;
        int evilwizard = Integer.parseInt(inputEvil[6]) * 10;

        int evil = orcs + evilMen + wargs + goblin + urukHai + trolls + evilwizard;

        if(good > evil){
            return "Battle Result: Good triumphs over Evil";
        }
        else if (good < evil){
            return "Battle Result: Evil eradicates all trace of Good";
        }
        else{
            return "Battle Result: No victor on this battle field";
        }
    }
}