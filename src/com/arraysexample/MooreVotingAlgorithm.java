package com.arraysexample;

import java.util.Scanner;

public class MooreVotingAlgorithm {
    public static int mooreAlgo(int[] arr){

        int count=0,candidate=-1;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
                count=1;
            }
            else{
               if(candidate==arr[i])
                   count++;
               else
                   count--;

            }
        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(candidate==arr[i])
                count++;
        }
        if(count>(arr.length/2)){
            return candidate;
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Majority Elements in the array is:"+mooreAlgo(arr));
    }
}
