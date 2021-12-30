package com.my_practic.alishev;

public class Arrays_13_1 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        System.out.println(number[1]);

        int[][] matrice = {{1,2,3, 4, 5}, {4}, {7,8,9}};
        System.out.println(matrice[2][2]);
        System.out.println(matrice[1][0]);
        System.out.println(matrice[0][4]);

        int[] number1 = new int[5];

        String[][] strings = new String[2][3];
        strings[0][1] = "privet";
        System.out.println(strings[0][1]);
    }
}
