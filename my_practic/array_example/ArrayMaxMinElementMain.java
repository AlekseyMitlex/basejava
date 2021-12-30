package com.my_practic.startjava.lesson_4;

public class ArrayMaxMinElementMain {
    public static void maxMin(double[] array) {
        double min = array[0];
        double max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Минимальный элемент массива: " + min + " Максимальныйэлемент массива " + max);
    }

    public static void main(String[] args) {
        double[] array1 = {1.05, -3.14, 8.0, 9.19, -3, 0};
        maxMin(array1);
        maxMin(new double [] {2.5, -1.3});
    }
}

