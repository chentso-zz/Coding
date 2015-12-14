package HashMap;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by Peter on 12/14/2015.
 */
public class UniqueRandomNumbers {
    public static void main(String args[]) {
        System.out.println(uniqueRandomNumbers());
    }

    public static int uniqueRandomNumbers(){
        Random random = new Random();

        // Keep the random number as key and boolean value to indicate whether it is unique
        HashMap<Integer, Boolean> map = new HashMap<>();

        for(int i = 0; i < 100000 ; i++){
            int randomNumber = random.nextInt(500000) + 1;

            if (!map.containsKey(randomNumber)) {
                // If not in map, mark it as unique
                map.put(randomNumber, true);
            } else {
                // Otherwise, mark the number as not unique (false)
                if (map.get(randomNumber)) map.put(randomNumber, false);
            }
        }

        int count = 0;

        // Loop through HashMap and count unique numbers
        for(int key : map.keySet()){
            boolean val = map.get(key);
            if (val) count++;
        }

        return count;
    }
}