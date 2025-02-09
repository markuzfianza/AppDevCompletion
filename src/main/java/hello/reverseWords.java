import java.util.Arrays;
import java.util.stream.Collectors;

public class reverseWords {
    public static String reverseWords(final String original) {
        if (original == null || original.isEmpty()) {
            return original;
        }

        return Arrays.stream(original.split(" "))
                     .map(word -> new StringBuilder(word).reverse().toString())
                     .collect(Collectors.joining(" "));
    }
}
