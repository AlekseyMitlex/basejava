package com.my_practic.startjava.lesson_4;

public class ArraysStringConstructorChar {
    public static void main(String[] args) {
//        Конструктор класса String
        char[] array = new char[]{'p', 'r', 'i', 'v', 'e', 't'};
        String s = new String(array);
        System.out.println(s);
    }
}
