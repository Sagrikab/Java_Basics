package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListsOfLists {

    public static void main(String[] args) {
        List<List<Integer>> listsOfList=new ArrayList<>();
        //System.out.println(listsOfList); //will print a empty lists
        listsOfList.add(new ArrayList<>());
      //  System.out.println(listsOfList); //will print list within lists as empty list
        List<List<String>> listsOfListString=new ArrayList<>();
        int n=3;
        for(int i=0;i<2;i++) {
            listsOfListString.add(new ArrayList<>(Collections.nCopies(n, "2")));
        }
        listsOfListString.forEach(System.out::println);
    //Arrays.asList() is also the method which add the values to the List of List
        listsOfList=new ArrayList<>(List.of(new ArrayList<>(List.of(1,2,3)),new ArrayList<>(List.of(4,5,6))));
       // System.out.println(listsOfList);
        listsOfList.forEach(System.out::println);
    }
}
