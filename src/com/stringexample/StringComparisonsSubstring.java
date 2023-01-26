package com.stringexample;

import java.util.Scanner;

public class StringComparisonsSubstring {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=3;
        System.out.println(getSmallestAndLargest(s,k));
    }
    private static String getSmallestAndLargest(String s,int k){
        String smallest=s.substring(0,k);
        String largest=s.substring(0,k);

        for(int i=0;i<s.length();i++){
            if(i+k<=s.length()){
                String sub=s.substring(i,i+k);
                if(sub.compareTo(smallest)<0){
                    smallest=sub;
                }
                else if(sub.compareTo(largest)>0){
                    largest=sub;
                }
            }
        }
        return smallest+"\n"+largest;
    }
}
