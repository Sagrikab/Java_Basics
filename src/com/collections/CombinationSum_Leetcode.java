package com.collections;
import java.util.*;
public class CombinationSum_Leetcode {

   static List<List<Integer>> res=new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates,int target){

        getCombination(candidates,target,0,new ArrayList<>(),target);
        return res;
    }

    public static void getCombination(int[] candidates,int target,int index,List<Integer> list,int sum){
        if(sum==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(sum>=candidates[i]){
                list.add(candidates[i]);
                getCombination(candidates,target,i,list,sum-candidates[i]);
              list.remove(list.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] candidates={2,3,6,7};
        int target=7;

        System.out.println(combinationSum(candidates,target));
    }
}
