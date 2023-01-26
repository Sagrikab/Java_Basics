package com.collections;

import java.util.ArrayList;

/*
Current capacity of ArrayList is 10
capacity=(current capacity*3/2)+1
 */
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> arrList=new ArrayList<>();
        arrList.add("A");
        arrList.add("B");
        System.out.println(arrList);
        arrList.get(0);
        arrList.set(1,"Q");
        System.out.println(arrList);
        System.out.println(arrList.size());
        arrList.remove(1);
        System.out.println(arrList);
        System.out.println(arrList.indexOf("A"));
        System.out.println(arrList.lastIndexOf("A"));
        System.out.println(arrList.contains("a"));
        System.out.println(arrList.isEmpty());
    }
}
