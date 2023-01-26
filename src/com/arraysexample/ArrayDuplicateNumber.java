package com.arraysexample;

import java.util.HashMap;
import java.util.Scanner;

//Using Linked List tortoise method
public class ArrayDuplicateNumber {
    /*
    Tortoise method
    -----------------
//    public static int DuplicateNumber(int[] arr){
//        int slow=arr[0];
//        int fast=arr[0];
//
//        do{
//            slow=arr[slow];
//            fast=arr[arr[fast]];
//        }while(slow!=fast);
//
//        fast=arr[0];
//        while(slow!=fast){
//            slow=arr[slow];
//            fast=arr[fast];
//
//        }
//        return slow;
//    }

*/
     public static int Duplicate(int[] arr){
         HashMap<Integer,Integer> hmap=new HashMap<>();
         for(int i=0;i<arr.length;i++){
             if(hmap.containsKey(arr[i])){
                 return arr[i];
             }
             else{
                hmap.put(arr[i],1);
             }
         }
         return -1;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       // System.out.println(DuplicateNumber(arr));
        System.out.println(Duplicate(arr));




    }
}
