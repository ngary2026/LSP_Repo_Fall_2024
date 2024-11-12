package org.howard.edu.lsp.assignment6;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerSetTest {

    private IntegerSet set1;
    private IntegerSet set2;

    @BeforeEach
    public void setUp() {
        set1 = new IntegerSet();
        set2 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set1.add(1);
        set1.clear();
        assertTrue(set1.isEmpty(), "Set should be empty after clear.");
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(5, set2.length(), "Length should be 5");
        set2.clear();
        assertEquals(0, set2.length(), "Length should be 0 after clear.");
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet set3 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        assertTrue(set2.equals(set3), "Sets should be equal.");
        set3.add(6);
        assertFalse(set2.equals(set3), "Sets should not be equal.");
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        assertTrue(set2.contains(3), "Set should contain 3.");
        assertFalse(set2.contains(6), "Set should not contain 6.");
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        assertEquals(5, set2.largest(), "Largest should be 5.");
    }

    @Test
    @DisplayName("Test case for largest with empty set")
    public void testLargestWithEmptySet() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            set1.largest();
        });
        assertEquals("Set empty", exception.getMessage());
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() {
        assertEquals(1, set2.smallest(), "Smallest should be 1.");
    }

    @Test
    @DisplayName("Test case for smallest with empty set")
    public void testSmallestWithEmptySet() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            set1.smallest();
        });
        assertEquals("Set empty", exception.getMessage());
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        set1.add(10);
        assertTrue(set1.contains(10), "Set should contain 10 after adding.");
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        set2.remove(3);
        assertFalse(set2.contains(3), "Set should not contain 3 after removal.");
    }

    @Test
    @DisplayName("Test case for remove() - removing non-existing element")
    public void testRemoveNonExistingElement() {
        set1.remove(5); // 5 is not in set1
        assertEquals(0, set1.length(), "Set size should remain the same");
    }
    
    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet set3 = new IntegerSet(new ArrayList<>(Arrays.asList(4, 5, 6, 7)));
        List<Integer> expectedUnion = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        assertEquals(expectedUnion, set2.union(set3), "Union should contain all unique elements.");
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        IntegerSet set3 = new IntegerSet(new ArrayList<>(Arrays.asList(3, 4, 5, 6)));
        List<Integer> expectedIntersect = Arrays.asList(3, 4, 5);
        assertEquals(expectedIntersect, set2.intersect(set3), "Intersect should contain common elements.");
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
    	 set1.diff(set2);
         assertFalse(set1.contains(3), "Set 1 should not contain 3");
         assertFalse(set1.contains(4), "Set 1 should not contain 4");
         assertFalse(set1.contains(5), "Set 1 should not contain 5");
         assertEquals(2, set1.length(), "Set 1 should have 2 elements after diff");
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet set3 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 6, 7, 8)));
        List<Integer> expectedComplement = Arrays.asList(6, 7, 8);
        assertEquals(expectedComplement, set2.complement(set3), "Complement should contain elements in set3 not in set2.");
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertTrue(set1.isEmpty(), "Set should be empty initially.");
        set1.add(1);
        assertFalse(set1.isEmpty(), "Set should not be empty after adding an element.");
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        String expectedString = "[1, 2, 3, 4, 5]";
        assertEquals(expectedString, set2.toString(), "toString should match the expected format.");
    }
}
