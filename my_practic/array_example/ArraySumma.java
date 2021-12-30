package com.my_practic.startjava.lesson_4;

public class ArraySumma {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        int summa = 0;
        for (int a : array) {
            summa += a;
        }

        System.out.println(summa);

        // Суммы ссылочных массивов

        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"mat analiz", "filosofiya"};

        for (String s1 : students) {
            for (String s2 : exams) {
                System.out.println(s1 + " " + s2);
            }

        }
    }
}
