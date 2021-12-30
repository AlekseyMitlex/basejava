package com.my_practic.alishev;

public class Arrays_11 {
    public static void main(String[] args) {
        int number = 10;
        int[] numbers = new int[5];
//        numbers[0] = 10;
//        numbers[1] = 20;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        int[] numbers1 = {1, 2, 3};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i] + " ");
        }
    }
}
