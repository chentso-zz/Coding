package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Peter on 12/15/2015.
 */
public class UniqueOfAList {

    public static List<Integer> getUniqueOfListFromAnother(List<Integer> listOne, List<Integer> listTwo){
        if (listOne == null) return null;
        if (listTwo == null) return listOne;

        HashSet<Integer> set = new HashSet<>();

        /* Put all the values of listOne into the hashset */
        set.addAll(listOne);

        /* Remove all the values in the hashset that are in listTwo */
        set.removeAll(listTwo);

        return new ArrayList<Integer>(set);
    }
}
