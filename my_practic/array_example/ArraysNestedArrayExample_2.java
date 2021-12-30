package com.my_practic.startjava.lesson_4;

import java.util.Arrays;

/**
 * Java Arrays Example Program
 *
 * @author pankaj
 *
 */
public class ArraysNestedArrayExample_2 {

    public static void main(String[] args) {
        // Compare two nested arrays of type integer which are equal
        int[] a1 = { 1, 2, 3 };
        int[] a2 = { 1, 2, 3 };
        Object[] b1 = {a1};
        Object[] b2 = {a2};
        boolean equal = Arrays.deepEquals(b1, b2);

        if (equal) {
            System.out.println("Arrays b1 and b2 are equal with Result : " + equal);
        } else {
            System.out.println("Arrays b1 and b2 are not equal with Result : " + equal);
        }

    }

}
