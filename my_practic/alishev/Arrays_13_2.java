package com.my_practic.alishev;

public class Arrays_13_2 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        System.out.println(number[1]);

        int[][] matrice = {{1, 2, 3, 4, 5}, {4}, {7, 8, 9}};
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.println(matrice[i][j] + " ");
            }
        }
    }
}
