/**
 * 7 kyu : Leap Years
 * Link : https://www.codewars.com/kata/526c7363236867513f0005ca
 *
 * @author Markuzz Fianza
 * @author Minette Victoria Mandac
 *
 * This class contains a method to determine if a given year is a leap year.
 */
public class LeapYears {

    /**
     * Determines whether the provided year is a leap year.
     * A leap year is divisible by 4 but not by 100, unless it is also divisible by 400.
     *
     * @param year the year to be checked
     * @return true if the year is a leap year, false otherwise
     */
    public static boolean isLeapYear(int year) {
        return ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0);
    }
}