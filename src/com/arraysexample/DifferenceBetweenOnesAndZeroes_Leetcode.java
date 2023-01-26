package com.arraysexample;

import java.util.Arrays;
import java.util.Scanner;

public class DifferenceBetweenOnesAndZeroes_Leetcode {
    public static int[][] onesMinusZeroes(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] or = new int[m], zr = new int[m];
        int[] oc = new int[n], zc = new int[n];
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                count = count + grid[i][j];
            }
            or[i] = count;
            zr[i] = n - count;
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                count = count + grid[j][i];
            }
            oc[i] = count;
            zc[i] = m - count;
        }
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = or[i] + oc[j] - zr[i] - zc[j];
            }
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int[][] grid = new int[rows][col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                grid[i][j] = sc.nextInt();
            }
        }


                System.out.println(Arrays.deepToString(onesMinusZeroes(grid)));


    }
}

