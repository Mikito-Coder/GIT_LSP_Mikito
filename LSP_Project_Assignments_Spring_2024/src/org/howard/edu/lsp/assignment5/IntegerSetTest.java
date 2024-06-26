package org.howard.edu.lsp.assignment5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class IntegerSetTest {
	private IntegerSet set;
	 @BeforeEach
	    public void setUp() {
	        set = new IntegerSet(); // Before each unit test, it initializes an empty set
	    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertEquals(1, set.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        IntegerSet set2 = new IntegerSet();
        set2.add(1);
        assertTrue(set1.equals(set2));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1));
    }

    @Test
    @DisplayName("Test case for largest with exception handling")
    public void testLargest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, set::largest);
        
        set.add(1);
        set.add(2);
        assertEquals(2, set.largest());
    }

    @Test
    @DisplayName("Test case for smallest with exception handling")
    public void testSmallest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, set::smallest);
        
        set.add(1);
        set.add(2);
        assertEquals(1, set.smallest());
        
    }

    
    
    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1));
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.remove(1);
        assertFalse(set.contains(1));
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set1.union(set2);
        assertTrue(set1.contains(1) && set1.contains(2));
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertTrue(set1.contains(2) && set1.length() == 1);
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set1.diff(set2);
        assertTrue(set1.contains(1) && !set1.contains(2));
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
    	IntegerSet set2 = new IntegerSet();
        set.add(1);
        //set.add(2);
        set2.add(2);
        set.complement(set2);

        // Check that the complement operation correctly removes the common element (1) from set
        // and only retains elements that are unique to set, which should be (2)
        assertTrue(!set.contains(1) && set.contains(2), "Set should not contain 1 and contain 2 after complement operation.");

        setUp(); // Re-initialize the sets for the next test
        set.add(1);
        set.add(2);
        set2.clear(); // Clear set2 making it an empty set
        set2.add(2);
        set.complement(set2);

        // Check that the complement operation results in an empty set when all elements of set
        // are also contained in set2
        assertTrue(set.isEmpty(), "Set should be empty after removing elements that also exist in set2.");

        setUp(); // Re-initialize the sets for the next test
        set.add(1);
        set.add(2);
        set2.clear(); // Clear set2 making it an empty set
        set.complement(set2);

        // Check that the complement operation does not change set if set2 is empty
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertEquals("[1]", set.toString());
    }
}

