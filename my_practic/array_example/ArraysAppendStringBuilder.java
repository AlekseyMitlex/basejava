package com.my_practic.startjava.lesson_4;

public class ArraysAppendStringBuilder {
    public static void main(String[] args) {
        char[] array = new char[]{'p', 'r', 'i', 'v', 'e', 't'};

        StringBuilder sb = new StringBuilder("Hellow World");
        sb.append(array, 2, 3);
        System.out.println(sb);

        sb.append("java");
        System.out.println(sb);
    }
}
