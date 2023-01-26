package com.arraysexample;

import java.util.Scanner;

//Search for the indices of x in the given 2D Array
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int nos[][]=new int[rows][cols];
        //Taking input from user for rows and cols

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                nos[i][j]=sc.nextInt();
            }
        }

        int x=sc.nextInt();

        //Output the values of the matrix when find for the value x the indices should be seen as output

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(nos[i][j]==x) {
                    System.out.print("x found at row: " + i + " and col: " + j);

                }
            }
            System.out.println();
        }

    }
}
