package Strings;

import java.util.Arrays;

/**
 * Created by Peter on 12/14/2015.
 */
public class IsPermutation {
    public static boolean isPermutation(String s1, String s2){

        if (s1 == null && s2 == null) return true;
        if (s1 == null && s2 != null) return false;
        if (s1 != null && s2 == null) return false;

        char[] s1c = s1.toCharArray();
        char[] s2c = s2.toCharArray();

        Arrays.sort(s1c);
        Arrays.sort(s2c);

        String s1_sorted = String.valueOf(s1c);
        String s2_sorted = String.valueOf(s2c);

        return (s1_sorted.equals(s2_sorted));
    }
}
