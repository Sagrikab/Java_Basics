package com.arraysexample;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSumLeetCode {
    public static int[] twoSum(int[] arr,int target){

        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            Integer diff=(target-arr[i]);
            if(hmap.containsKey(diff)){
                int[] ret={hmap.get(diff),i};
                return ret;
            }
            hmap.put(arr[i],i);
        }

        return new int[] {};
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int[] res=twoSum(arr,target);


            if(res.length==2){
                System.out.println(res[0]+" "+res[1]);
            }
            else {
                System.out.println("null");
            }

    }
}