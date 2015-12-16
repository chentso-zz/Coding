package Strings;

/**
 * Created by Peter on 12/15/2015.
 */
public class StringToInteger {

    public static int stringToInteger(String s){
        String ILLEGAL_ARG_MSG = "String is not a proper number value";

        int number = 0;
        if (s == null) throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        if (s.equals("-")) throw new IllegalArgumentException(ILLEGAL_ARG_MSG);

        /* Check if is negative */
        boolean isNegative = s.charAt(0) == '-';
        int factor = isNegative ? -1 : 1;
        int startPosition = isNegative ? 1 : 0;

        for(int i = startPosition; i < s.length(); i++){
            /* Check if any of the characters are not number chars */
            char c = s.charAt(i);

            if (c > '9' || c < '0')
                throw new IllegalArgumentException(ILLEGAL_ARG_MSG);

            int digit = c - '0';

            if (!isNegative) {
                /* Check maximum integer overflow */
                if (Integer.MAX_VALUE / 10 < number || Integer.MAX_VALUE - digit < (number * 10)) {
                    throw new IllegalArgumentException("Integer max overflow");
                }
            } else {
                /* Check minimum integer overflow */
                if (Integer.MIN_VALUE / 10 > -number || Integer.MIN_VALUE + digit > (-number * 10)) {
                    throw new IllegalArgumentException("Integer min overflow");
                }
            }
            number = number * 10 + digit;


        }
        return number * factor;
    }
}
