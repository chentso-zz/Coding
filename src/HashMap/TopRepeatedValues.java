package HashMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by Peter on 12/14/2015.
 */
public class TopRepeatedValues {
    public static void main(String args[]) {
        System.out.println(topRepeatedValues());
    }

    public static LinkedList<Integer> topRepeatedValues(){
        Random random = new Random();
        // Keep the random number value as key and its frequency as value
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < 100000 ; i++){
            int randomNumber = random.nextInt(500000) + 1;

            if (!map.containsKey(randomNumber)) {
                // If not in map, add it in to the map
                map.put(randomNumber, 1);
            } else {
                // Otherwise, get the number and increment
                int val = map.get(randomNumber);
                map.put(randomNumber, val+1);
            }
        }

        int maxValue = 0;
        LinkedList<Integer> maxNumberList = new LinkedList<>();

        // Loop through HashMap and find largest count
        for(int key : map.keySet()){
            int val = map.get(key);

            // If the count is greater than current max, clear the set of numbers
            // and put this random number as the only key in the set
            if (val > maxValue) {
                maxValue = val;
                maxNumberList.clear();
                maxNumberList.add(key);
            }

            // If count is the same as the current max, then add this number
            // to indicate a tie random number
            else if (val == maxValue) {
                maxNumberList.add(key);
            }
        }

        return maxNumberList;
    }
}
