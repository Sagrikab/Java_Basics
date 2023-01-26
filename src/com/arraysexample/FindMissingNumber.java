package com.arraysexample;

import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n-1];
        long total=((long)n*(n+1))/2;
        long sum=0;

        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println(total-sum);
    }
}
