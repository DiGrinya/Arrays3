package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {
                    {2, 4, 3, 3},
                    {5, 7, 8, 5},
                    {2, 4, 3, 3},
                    {5, 7, 8, 5}
        };

        System.out.println(Arrays.deepToString(task3(arr)));
    }

    public static int[][] task3(int[][] matrix) {
        int rows = matrix.length;
        int colm = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 1 + i; j < colm; j++) {
                matrix[i][j] = 1;
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                matrix[i][j] = 0;
            }
        }
        return matrix;
    }
}
