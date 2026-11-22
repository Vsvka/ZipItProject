package javaprojects;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ZipItTest {
    
    @Test
    public void testEqualLengthLists() {

        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6);
        List<Integer> result = ZipIt.zip(list1, list2);

        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), result);
    }

    @Test
    public void testFirstListLonger() {

        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 4);
        List<Integer> result = ZipIt.zip(list1, list2);

        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 7), result);
    }

    @Test
    public void testSecondListLonger() {

        List<String> list1 = Arrays.asList("A", "C");
        List<String> list2 = Arrays.asList("B", "D", "E", "F");
        List<String> result = ZipIt.zip(list1, list2);

        assertEquals(Arrays.asList("A", "B", "C", "D", "E", "F"), result);
    }

    @Test
    public void testBothListsEmpty() {

        List<Integer> list1 = Collections.emptyList();
        List<Integer> list2 = Collections.emptyList();
        List<Integer> result = ZipIt.zip(list1, list2);

        assertTrue(result.isEmpty());
    }

    @Test
    public void testOneListEmpty() {

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Collections.emptyList();
        List<Integer> result = ZipIt.zip(list1, list2);

        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    public void testOriginalListsUnchanged() {

        List<Integer> list1 = Arrays.asList(1, 3);
        List<Integer> list2 = Arrays.asList(2, 4);
        ZipIt.zip(list1, list2);

        assertEquals(Arrays.asList(1, 3), list1);
        assertEquals(Arrays.asList(2, 4), list2);
    }
}
