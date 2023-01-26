package com.collections;

import java.util.TreeSet;

public class SetSortedSetNavigableSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet=new TreeSet<>();

        for(int i=0;i<8;i++){
            treeSet.add(i);

        }
        System.out.println(treeSet);
        //SortedSet Methods
        System.out.println("first(): "+treeSet.first());
        System.out.println("last(): "+treeSet.last());
        System.out.println("headSet(): "+treeSet.headSet(5));
        System.out.println("tailSet(): "+treeSet.tailSet(6));
        System.out.println("subset(): "+treeSet.subSet(2,6));

        //NavigableSet methods
        System.out.println("******* NavigableSet Methods *********");
        System.out.println("lower(): "+treeSet.lower(6));
        System.out.println("floor(): "+treeSet.floor(5)); //less than or equal to
        System.out.println("floor(): "+treeSet.floor(8));
        System.out.println("ceiling(): "+treeSet.ceiling(7));
        System.out.println("ceiling(): "+treeSet.ceiling(8));
        System.out.println("higher(): "+treeSet.higher(6));
        System.out.println("higher(): "+treeSet.higher(7));
        System.out.println("pollFirst(): "+treeSet.pollFirst());
        System.out.println("pollLast(): "+treeSet.pollLast());
        System.out.println(treeSet);



    }
}
