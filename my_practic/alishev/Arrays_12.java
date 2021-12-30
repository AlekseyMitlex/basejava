package com.my_practic.alishev;

public class Arrays_12 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        String[] strings = new  String[3];
        strings[0] = "privet";
        strings[1] = "poka";
        strings[2] = "java";
        System.out.println(strings[0]);
        System.out.println(strings[2]);

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }

        for (String string : strings) {
            System.out.println(string);
        }

        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int x : numbers1) {
            sum += x;
            System.out.println(sum);
        }

        int value = 0;
        String s;
    }
}
