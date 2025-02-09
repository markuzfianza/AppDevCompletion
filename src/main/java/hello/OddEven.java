package hello;

public class OddEven {
    public static String oddOrEven(int number) {
        if (number < 0) {
            return "Invalid input: Number must be non-negative";
        }
        return (number % 2 == 0) ? "Even" : "Odd";
    }
}
