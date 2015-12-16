package SimpleArrays;

import java.util.Arrays;

/**
 * Created by Peter on 12/14/2015.
 */
public class DutchFlagPartition {

    public static void main(String args[]){
        int[] arr = {2 ,3, 5, 1, 10};
        dutchFlagPartition(arr, 2);

        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] a, int x, int y){
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }

    public static void dutchFlagPartition(int[] array, int partitionValue){
        int left = 0, right = array.length - 1;
        int placer = left;

        for(int current = placer; current < right ; current++){
            int currentValue = array[current];

            if (currentValue < partitionValue) {
                swap(array, current, placer++);
            }

            System.out.println(Arrays.toString(array));
        }
    }
}
