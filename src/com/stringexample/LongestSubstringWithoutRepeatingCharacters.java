package com.stringexample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class LongestSubstringWithoutRepeatingCharacters {

    public static int LongestSubstring(String s){
        Queue<Character> queue=new LinkedList<>();
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            if(!queue.contains(s.charAt(i))){
                queue.add(s.charAt(i));
                if(queue.size()>maxLength){
                    maxLength=queue.size();
                }
            }
            else{
                while(queue.poll()!=s.charAt(i)){}
                //queue.add(s.charAt(i));
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(LongestSubstring(s));
    }
}
