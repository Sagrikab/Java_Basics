package com.stringexample;

public class StringExample {
    public static void main(String[] args) {
//String is a sequence of characters

        char ch[]={'s','a','g','a','r','i','k','a'};
        String s=new String(ch);
        System.out.println(s);

        // String in two ways 1. new keyword  2. string literal

        String s2=new String("abc");
        String s3=new String("abc");
        System.out.println(s2==s3);  //false as the object created will be different
        System.out.println(s2.equals(s3));

    }
}
