package com.stringexample;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder(s);

        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontCharAt=sb.charAt(front);
            char backCharAt=sb.charAt(back);

            sb.setCharAt(front,backCharAt);
            sb.setCharAt(back,frontCharAt);


        }

        System.out.println(sb);

    }
}
