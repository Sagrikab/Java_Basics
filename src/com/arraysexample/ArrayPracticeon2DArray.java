package com.arraysexample;

public class ArrayPracticeon2DArray {
    public static void main(String[] args) {
        int[][] grid={{0,1,1},{1,0,1},{0,0,1}};
        System.out.println(grid.length);
        System.out.println(grid[0].length);
        System.out.println(grid[0][0]);  System.out.println(grid[0][1]);  System.out.println(grid[0][2]);

        for(int i=0;i< grid.length;i++){
            int count=0;
            for(int j=0;j<grid[0].length;j++){
                count=count+grid[i][j];
                System.out.print(count+" ");
            }
            System.out.println();
        }

    }
}
