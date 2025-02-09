package hello;

public class StringCleaning {
    static String stringClean(final String text) {
        StringBuilder s = new StringBuilder();

        for(char c : text.toCharArray())
            if (!Character.isDigit(c)) {
                s.append(c);
            }
        return s.toString();
    }
}
