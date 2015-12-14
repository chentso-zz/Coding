package HashMap;

import java.util.HashSet;

/**
 * Created by Peter on 12/14/2015.
 */
public class HasUniqueChars {

    public static void main(String args[]){
        System.out.println(hasUniqueChars("Peter"));
        System.out.println(hasUniqueChars("Pter "));
    }

    public static boolean hasUniqueChars(String word){
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);

            if (!set.contains(c)) {
                set.add(c);
            } else {
                return false;
            }
        }

        return true;
    }
}
