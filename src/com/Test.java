package com;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int index = 4;
        int [] array = {2, 5, 6, 7, 11, 13, 18};
        int [] array1 = new int[10];

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        System.arraycopy(array, index, array1, index, array.length- index);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));

    }
}
