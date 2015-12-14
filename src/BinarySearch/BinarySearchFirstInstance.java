package BinarySearch;

/**
 * Created by Peter on 12/14/2015.
 */
public class BinarySearchFirstInstance {

    public static void main(String args[]){
        int[] test = {0, 1, 2, 2, 2, 2, 5, 8, 8, 10, 14, 20, 45, 100};

        System.out.println(binarySearchFirstInstance(test, 0));

    }

    public static int binarySearchFirstInstance(int[] array, int search){
        int len = array.length;
        int left = 0, right = len - 1;
        int mid = 0;

        while(left <= right){
            mid = left + (right - left) / 2;

            if (array[mid] == search){
                // If the element is a match, only return if it is the first value
                // or if the value to the left is not the search value
                if (mid == 0 || (mid != 0 && array[mid - 1] != search)) {
                    return mid;
                }
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
