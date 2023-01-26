package com.arraysexample;

/*
Given an array of integers nums,calculate the pivot index of this array
Return the leftmost pivot index. If no such index exists,return -1

nums=[1,7,3,6,5,6]
O/P-->3
Left sum=nums[0]+nums[1]+nums[2]=1+7+3=11
Right sum=nums[4]+nums[5]=5+6=11
 */
public class FindPivotIndex_Leetcode {

    public static int pivotIndex(int[] nums){

        if(nums==null || nums.length<=2)
            return -1;
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];

        for(int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];

        }
        for(int i=0;i<n;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
return -1;
    }
    public static void main(String[] args) {

        int[] nums={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
        int[] nums2={1,2,3};
        System.out.println(pivotIndex(nums2));
        int[] nums3={2,1,-1};
        System.out.println(pivotIndex(nums3));
    }
}
