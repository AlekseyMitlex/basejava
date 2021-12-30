package com.my_practic.startjava.lesson_4;

import java.util.Arrays;

/**
 * Java Arrays binarySearch
 *
 * @author pankaj
 *
 */
public class ArraysBinarySearchExample {

    public static void main(String[] args) {

        // Searching a value from array of integer
        int[] integers = { 5, 2, 1, 4, 3, 9, 6, 8, 7, 10 };
        int index = Arrays.binarySearch(integers, 2);
        if (index >= 0) {
            System.out.println("Element is found at the index :" + index);
        } else {
            System.out.println("Element is not found");
        }

        // Searching a value from array of integer with specific range
        int fromIndex = 2;
        int toIndex = 7;
        int index2 = Arrays.binarySearch(integers, fromIndex, toIndex, 9);
        if (index2 >= 0) {
            System.out.println("Element is found at the index :" + index2);
        } else {
            System.out.println("Element is not found");
        }

    }

}
