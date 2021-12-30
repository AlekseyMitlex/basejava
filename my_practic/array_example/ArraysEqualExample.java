package com.my_practic.startjava.lesson_4;

import java.util.Arrays;

/**
 * Java Arrays Example Program
 *
 * @author pankaj
 *
 */
public class ArraysEqualExample {

    public static void main(String[] args) {

        // Compare two arrays of type integer which are equal
        int[] a1 = { 1, 2, 3 };
        int[] a2 = { 1, 2, 3 };

        boolean equal = Arrays.equals(a1, a2);
        if (equal) {
            System.out.println("Arrays a1 and a2 are equal with Result : " + equal);
        }else {
            System.out.println("Arrays a1 and a2 are not equal with Result : " + equal);
        }


        // Compare two arrays of type integer which are not equal
        int[] b1 = { 1, 2, 3 };
        int[] b2 = { 4, 5, 6 };

        boolean equal1 = Arrays.equals(b1, b2);



        if (equal1) {
            System.out.println("Arrays b1 and b2 are equal with Result : " + equal1);

        }else {
            System.out.println("Arrays b1 and b2 are not equal with Result : " + equal1);
        }

    }

}
