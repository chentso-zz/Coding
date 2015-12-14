package Sorting;

/**
 * Created by Peter on 12/14/2015.
 */
public class QuickSort {

    public static void qsort(int[] array, int left, int right){
        if (array == null) return;

        if (left >= right) return;
        int pivot = partition(array, left, right);

        qsort(array, left, pivot - 1);
        qsort(array, pivot + 1, right);
    }

    public static void swap(int[] array, int a, int b){
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public static int partition(int[] array, int left, int right){
        int mid = left + (right - left) / 2;
        int pv = array[mid];
        int placer = left;

        swap(array, mid, right);

        for(int i = left; i < right; i++){
            if (array[i] < pv) {
                swap(array, i, placer++);
            }
        }
        swap(array, placer, right);
        return placer;
    }
}
