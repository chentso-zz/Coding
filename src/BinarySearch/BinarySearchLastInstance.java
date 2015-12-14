package BinarySearch;

/**
 * Created by Peter on 12/14/2015.
 */
public class BinarySearchLastInstance {

    public static int binarySearchLastInstance(int[] array, int search){
        int len = array.length;
        int left = 0, right = len - 1;
        int mid = 0;

        while(left <= right){
            mid = left + (right - left) / 2;

            if (array[mid] == search){
                if (mid == (len - 1) || (mid != (len - 1) && array[mid + 1] != search)) {
                    return mid;
                }
            }

            if (array[mid] <= search){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
