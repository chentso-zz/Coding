package Tests;

import Strings.IsPermutation;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Peter on 12/14/2015.
 */
public class StringsTests {

    @Test
    public void testIsPermutation() throws Exception {
        assertTrue(IsPermutation.isPermutation("peter", "retep"));
        assertTrue(IsPermutation.isPermutation("p eter", "re tep"));
        assertTrue(IsPermutation.isPermutation("", ""));
        assertTrue(IsPermutation.isPermutation(" ", " "));
        assertTrue(IsPermutation.isPermutation("_", "_"));
        assertTrue(IsPermutation.isPermutation(null, null));

        assertFalse(IsPermutation.isPermutation(null, ""));
        assertFalse(IsPermutation.isPermutation("p ", " "));
        assertFalse(IsPermutation.isPermutation("p ", "  p"));

    }
}