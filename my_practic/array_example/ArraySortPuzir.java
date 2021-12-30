package com.my_practic.startjava.lesson_4;

import java.util.Arrays;

public class ArraySortPuzir {
    public static void main(String[] args) {
            int[] array = {10, 3, 53, 2, 5, 7, 3, 6, 12, 3, 32, 65}; //исходный массив
            // Сортировка пузырьком
            int temp;                                               // переменная для замены
            for (int i = array.length - 1; i > 0; i--) {            // внешний цикл
                for (int j = 0; j < i; j++) {                       // внутренний цикл
                    if (array[j] > array[j + 1]) {                  // сравнение
                        temp = array[j];                            // если истино, то меняем
                        array[j] = array[j + 1];                    // местами элементы
                        array[j + 1] = temp;
                    }
                }
            }
            // конец сортировки
            System.out.println(Arrays.toString(array));             //выводим результат на консоль
    }
}
