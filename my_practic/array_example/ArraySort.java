package com.my_practic.startjava.lesson_4;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int array[] = {1, 9, 2, -4, 5, 12};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
