package com.stringexample;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");

        //charAt(index)
        System.out.println(sb.charAt(0));

        //setCharAt(index,set value)
//        sb.setCharAt(0,'P');
//        System.out.println(sb);

        //insertCharAt(index,inserting value)
        sb.insert(0,'S');
        System.out.println(sb);

        //append char at last

        StringBuilder sb2=new StringBuilder("h");
        sb2.append("ello");  //sb2.append(e) sb2.append(l) sb2.append(l) sb2.append(o)
        System.out.println(sb2);

    }
}
