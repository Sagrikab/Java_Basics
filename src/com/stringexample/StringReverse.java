package com.stringexample;

public class StringReverse {
    public static void main(String[] args) {
        String A="madam";
        StringBuilder sb=new StringBuilder(A);
        if(sb.reverse().toString().equals(A)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
