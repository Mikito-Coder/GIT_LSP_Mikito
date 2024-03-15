package org.howard.edu.lsp.midterm.question2;

/**
 * This interface defines the structure for a range of integers. It includes methods
 * to determine if a specific value falls within the range, if there is an overlap
 * between this range and another range, and to calculate the size of the range.
 */
public interface Range {

    /**
     * Checks if the specified value is within the range.
     *
     * @param value the integer value to check.
     * @return {@code true} if the value is within the range; {@code false} otherwise.
     */
    boolean contains(int value);

    /**
     * Determines if there is an overlap between this range and another specified range.
     *
     * @param other the other range to check for an overlap with.
     * @return {@code true} if there is at least one common element between the two ranges;
     *         {@code false} otherwise.
     */
    boolean overlaps(Range other);

    /**
     * Calculates the size of the range, defined as the number of discrete integers
     * that are within the range.
     *
     * @return the size of the range as an integer.
     */
    int size();
}


//package org.howard.edu.lsp.midterm.question2;
//
///**
// * This interface defines a range with methods to determine if a value is within it,
// * if it overlaps with another range, and to calculate the size of the range.
// */
//public interface Range {
//    boolean contains(int value); 
//    boolean overlaps(Range other);
//    int size();
//}