package Tests;

import Sorting.QuickSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Peter on 12/14/2015.
 */
public class SortingTests {

    @Test
    public void testQsort() throws Exception {
        int[] test = {5, 2, 3, 78, 1, 32, 3, 12, 13}, compare = Arrays.copyOf(test, test.length);
        QuickSort.qsort(test, 0, test.length-1);
        Arrays.sort(compare);
        assertArrayEquals(compare, test);

        int[] test1 = {5, 2}, compare1 = Arrays.copyOf(test1, test1.length);
        QuickSort.qsort(test, 0, test.length-1);
        Arrays.sort(compare);
        assertArrayEquals(compare, test);

        int[] test2 = {5};
        int[] compare2 = {5};
        QuickSort.qsort(test, 0, test.length-1);
        Arrays.sort(compare);
        assertArrayEquals(compare, test);

        int[] test3 = {};
        int[] compare3 = {};
        QuickSort.qsort(test, 0, test.length-1);
        Arrays.sort(compare);
        assertArrayEquals(compare, test);

        int[] test4 = null;
        int[] compare4 = null;
        QuickSort.qsort(test, 0, test.length-1);
        Arrays.sort(compare);
        assertArrayEquals(compare, test);
    }



    @Test
    public void testPartition() throws Exception {

    }
}