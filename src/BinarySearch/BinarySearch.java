package BinarySearch;

import java.util.Arrays;

/**
 * Created by Peter on 12/14/2015.
 */
public class BinarySearch {
    public static void main(String[] args) {

        int[] test = {0, 1, 2, 2, 2, 2, 5, 8, 8, 10, 14, 20, 45, 100};

        System.out.println(binarySearch(test, 5));
    }

    public static int binarySearch(int[] array, int search){
        int len = array.length;
        int left = 0, right = len - 1;
        int mid = -1;

        while(left <= right){
            mid = left + (right - left) / 2;

            // This will return as soon as it finds the number, will not work for repeated values
            if (array[mid] == search) {
                return mid;
            }

            if (array[mid] < search){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
