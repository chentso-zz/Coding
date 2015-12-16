package Strings;

/**
 * Created by Peter on 12/15/2015.
 */
public class LongestPalindrome {

    public static String longestPalindrome(String s){
        if (s == null) return null;
        if (s == "") return "";

        StringBuffer sb = new StringBuffer();

        /* Interleave the string with spaces so to check both even and odd palindromes */
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++){
            sb.append(" " + s.charAt(i));
        }

        String interleaved = sb.toString();
        int len = interleaved.length();
        int memLeft = -1, memRight = -1, maxLength = -1;

        for(int i = 0; i < len; i++){
            int leftChecker = i - 1, rightChecker = i + 1;

            /* Look left and right to see if characters do not match */
            while (leftChecker >= 0 && rightChecker < len){
                char charLeft = interleaved.charAt(leftChecker);
                char charRight = interleaved.charAt(rightChecker);

                /* Not a palindrome anymore */
                if (charLeft != charRight) break;

                /* Otherwise still a palindrome, keep looking further left and right */
                leftChecker--;
                rightChecker++;
            }

            /* If current palindrome is longer than the longest palindrome found so far */
            int currentPalindromeLength = (rightChecker - 1) - (leftChecker + 1);

            /* If the substring of the palindrome starts on an odd index, then we need to
                subtract by two since they are artificially added spaces
             */
            if ((leftChecker + 1) % 2 != 0) currentPalindromeLength -= 2;

            if (currentPalindromeLength > maxLength) {
                memLeft = leftChecker + 1;
                memRight = rightChecker - 1;
                maxLength = currentPalindromeLength;
            }
        }

        /* Clear the string buffer so it can be used to build return string */
        sb = new StringBuffer();

        /* Extract the longest palindrome word */
        for(int i = memLeft; i <= memRight; i++){
            // Spaces were inserted in the odd indices, so only copy the even-indexed chars
            if (i % 2 == 0) {
                char c = interleaved.charAt(i);
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
