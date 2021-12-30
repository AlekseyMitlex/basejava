package com.my_practic.startjava.lesson_4;

import java.util.Arrays;
import java.util.List;

/**
 * Java Arrays Example Program
 *
 * @author pankaj
 *
 */

public class ArraysAsListExample {

    public static void main(String[] args) {

        String[] strings = {"one", "two", "three", "four", "five"};
        // strings array is converted into a List
        List<String> list = Arrays.asList(strings);
        System.out.println(list);
    }
}
