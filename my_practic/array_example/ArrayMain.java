package com.my_practic.startjava.lesson_4;

public class ArrayMain {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        float[] numbers1 = {5.1F, .5F, 200.5F};

        System.out.println(numbers.length);
        System.out.println(numbers1.length);

//        System.out.println(numbers);
//        System.out.println(numbers[i]);

        for (float v : numbers1) {
            System.out.print(v + " ");
        }

        System.out.println();

        for (int i = 0; i < numbers1.length; i++) {
            numbers[i] = i * 10;
            System.out.print(numbers[i] + " ");
        }

        String[] text = new String[3];
        for (String string: text) {
            System.out.println(string);
        }


    }
}
