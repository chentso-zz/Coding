package Tests;

import BinarySearch.BinarySearchFirstInstance;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Peter on 12/14/2015.
 */
public class BinarySearchFirstInstanceTest {

    @Test
    public void testBinarySearchFirstInstance() throws Exception {
        int[] test = {0, 1, 2, 2, 2, 2, 5, 8, 8, 10, 14, 20, 45, 100};

        assertEquals(-1, BinarySearchFirstInstance.binarySearchFirstInstance(test, 3));
        assertEquals(7, BinarySearchFirstInstance.binarySearchFirstInstance(test, 8));
        assertEquals(0, BinarySearchFirstInstance.binarySearchFirstInstance(test, 0));
        assertEquals(test.length - 1, BinarySearchFirstInstance.binarySearchFirstInstance(test, 100));
        assertEquals(test.length - 2, BinarySearchFirstInstance.binarySearchFirstInstance(test, 45));
        assertEquals(-1, BinarySearchFirstInstance.binarySearchFirstInstance(test, -1));
    }
}