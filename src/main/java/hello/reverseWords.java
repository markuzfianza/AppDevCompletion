import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

public static String reverseWords(final String original)
    {
        StringBuilder stringBuilder = new StringBuilder();
        StringJoiner stringJoiner = new StringJoiner(" ");
        stringBuilder.append(original);
        stringBuilder.reverse();
        String [] stringArray = stringBuilder.toString().split(" ", stringBuilder.length());
        Collections.reverse(Arrays.asList(stringArray));
        for (int i = 0; i< stringArray.length; i++){
            stringJoiner.add(stringArray[i]);
        }
        return stringJoiner.toString();
    }