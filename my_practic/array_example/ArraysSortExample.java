package com.my_practic.startjava.lesson_4;

import java.util.Arrays;

/**
 * Java Arrays Example Program
 *
 * @author pankaj
 *
 */
public class ArraysSortExample {

    public static void main(String[] args) {

        // Sorting Character
        char[] chars = {'B', 'D', 'C', 'A', 'E'};
        Arrays.sort(chars);
        System.out.print("Sorted Characters : ");
        for (char character : chars) {
            System.out.print(character+" ");
        }

        // Sorting Integer
        int[] integers = {5, 2, 1, 4, 3};
        Arrays.sort(integers);
        System.out.print("\nSorted Integers : ");
        for (int i : integers) {
            System.out.print(i+" ");
        }

        // Sorting Specific Range of Integers
        int[] ints = {5, 2, 1, 4, 3, 9, 6, 8, 7, 10};
        int fromIndex = 2;
        int toIndex = 7;
        Arrays.sort(ints, fromIndex, toIndex);
        System.out.print("\nSorted Integers of Specific Range : ");
        for (int i : ints) {
            System.out.print(i+" ");
        }
    }

}

