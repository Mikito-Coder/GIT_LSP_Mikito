package org.howard.edu.lsp.midterm.question2;

/**
 * This class is used to test the IntegerRange class.
 */
public class RangeTester {

    public static void main(String[] args) {
        IntegerRange range1 = new IntegerRange(1, 10);
        IntegerRange range2 = new IntegerRange(5, 15);
        
        // Testing contains method
        System.out.println("Range1 contains 5: " + range1.contains(5)); // Expected: true
        System.out.println("Range2 contains 20: " + range2.contains(20)); // Expected: false
        
        // Testing overlaps method
        System.out.println("Range1 overlaps Range2: " + range1.overlaps(range2)); // Expected: true
        
        // Testing size method
        System.out.println("Size of Range1: " + range1.size()); // Expected: 10

        // Testing equals method
        IntegerRange range3 = new IntegerRange(1, 10);
        System.out.println("Range1 equals Range3: " + range1.equals(range3)); // Expected: true
        System.out.println("Range1 equals Range2: " + range1.equals(range2)); // Expected: false
    }
}

//package org.howard.edu.lsp.midterm.question2;
//
//public class RangeTester {
//    public static void main(String[] args) {
//        // Create IntegerRange instances
//        IntegerRange range1 = new IntegerRange(1, 10);
//        IntegerRange range2 = new IntegerRange(5, 15);
//        IntegerRange range3 = new IntegerRange(20, 30);
//
//        // Test contains method
//        System.out.println("Range 1 contains 5: " + range1.contains(5)); // true
//        System.out.println("Range 1 contains 15: " + range1.contains(15)); // false
//
//        // Test overlaps method
//        System.out.println("Range 1 overlaps with Range 2: " + range1.overlaps(range2)); // true
//        System.out.println("Range 1 overlaps with Range 3: " + range1.overlaps(range3)); // false
//
//        // Test size method
//        System.out.println("Size of Range 1: " + range1.size()); // 10
//
//        // Test equals method
//        IntegerRange range4 = new IntegerRange(1, 10);
//        System.out.println("Range 1 equals Range 4: " + range1.equals(range4)); // true
//    }
//}
//


/**
 * This class is used to comprehensively test the IntegerRange class.
 

//package org.howard.edu.lsp.midterm.question2;
//
///**
// * This class is used to comprehensively test the IntegerRange class.
// */
//public class RangeTester {
//
//    public static void main(String[] args) {
//        // Typical ranges
//        IntegerRange range1 = new IntegerRange(1, 10);
//        IntegerRange range2 = new IntegerRange(5, 15);
//        IntegerRange range3 = new IntegerRange(-10, 0);
//        IntegerRange range4 = new IntegerRange(0, 0);
//        IntegerRange range5 = new IntegerRange(10, 20);
//
//        // Edge case: range with negative numbers
//        IntegerRange negativeRange = new IntegerRange(-20, -10);
//
//        // Test for single element range
//        IntegerRange singleElementRange = new IntegerRange(5, 5);
//
//        // Test for non-overlapping ranges
//        IntegerRange nonOverlappingRange1 = new IntegerRange(21, 30);
//        IntegerRange nonOverlappingRange2 = new IntegerRange(-30, -21);
//
//        // Test contains method
//        System.out.println("--- Testing contains method ---");
//        // ... (other tests are here) ...
//
//        // Test overlaps method
//        System.out.println("--- Testing overlaps method ---");
//        // ... (other tests are here) ...
//
//        // Test size method
//        System.out.println("--- Testing size method ---");
//        // ... (other tests are here) ...
//
//        // Test equals method
//        System.out.println("--- Testing equals method ---");
//        // ... (other tests are here) ...
//
//        // Additional tests to cover the full range of possible interactions
//        // Overlap with a range that is completely inside another
//        IntegerRange containedRange = new IntegerRange(12, 18);
//        System.out.println("Range2 overlaps containedRange: " + range2.overlaps(containedRange)); // Expected: true
//
//        // Overlap with a range that is exactly the same as another
//        IntegerRange sameAsRange1 = new IntegerRange(1, 10);
//        System.out.println("Range1 overlaps sameAsRange1: " + range1.overlaps(sameAsRange1)); // Expected: true
//
//        // Overlap with a range that has one common element
//        IntegerRange commonElementRange = new IntegerRange(10, 20);
//        System.out.println("Range1 overlaps commonElementRange: " + range1.overlaps(commonElementRange)); // Expected: true
//
//        // Overlap with a range that is outside but shares no common elements
//        IntegerRange adjacentRange = new IntegerRange(11, 20);
//        System.out.println("Range1 overlaps adjacentRange: " + range1.overlaps(adjacentRange)); // Expected: false
//
//        // Testing a range with a negative and a positive number
//        IntegerRange spanningZero = new IntegerRange(-5, 5);
//        System.out.println("Range3 overlaps spanningZero: " + range3.overlaps(spanningZero)); // Expected: true
//        System.out.println("Range1 overlaps spanningZero: " + range1.overlaps(spanningZero)); // Expected: true
//
//        // Check size for a range that includes 0
//        System.out.println("Size of spanningZero: " + spanningZero.size()); // Expected: 11
//
//        // Check equals for ranges with different bounds
//        System.out.println("spanningZero equals negativeRange: " + spanningZero.equals(negativeRange)); // Expected: false
//
//        // Check contains for boundary values
//        System.out.println("spanningZero contains -5: " + spanningZero.contains(-5)); // Expected: true
//        System.out.println("spanningZero contains 5: " + spanningZero.contains(5)); // Expected: true
//    }
//}
