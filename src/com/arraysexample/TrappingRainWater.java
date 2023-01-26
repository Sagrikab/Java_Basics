package com.arraysexample;

import java.util.Scanner;

public class TrappingRainWater {
    public static void TrapBruteForce(int[] arr){
        int water=0,lmax=arr[0],rmax=arr[0];
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>=0;j--){
                if(arr[j]>lmax)
                    lmax=arr[j];
            }
            for(int j=i;j< arr.length;j++){
                if(arr[j]>rmax)
                    rmax=arr[j];
            }
            water+=Math.min(lmax,rmax)-arr[i];
        }
        System.out.println("Total water stored: "+water+" units.");
    }
    public static void TrapOptimized(int n,int[] arr){
        int left[]=new int[n];
        int right[]=new int[n];
        int water=0;
        left[0]=arr[0];
        right[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<n;i++){
            if(arr[i]>left[i-1])
                left[i]=arr[i];
            else
                left[i]=left[i-1];
        }
        for(int i=n-2;i>=0;i--){
            if(arr[i]>right[i+1])
                right[i]=arr[i];
            else
                right[i]=right[i+1];
        }
        for(int i=0;i<n;i++){
            water+=Math.min(left[i],right[i])-arr[i];
        }
        System.out.println("Total water stored in units: "+water);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       // TrapBruteForce(arr);
        TrapOptimized(n,arr);
    }
}
