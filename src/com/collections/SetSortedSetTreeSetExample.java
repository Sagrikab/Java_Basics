package com.collections;

import java.util.TreeSet;

public class SetSortedSetTreeSetExample {
    public static void main(String[] args) {
        TreeSet<Character> treeSet=new TreeSet<>();
        treeSet.add('a');
        treeSet.add('b');
        treeSet.add('Z');
        treeSet.add('c');
        treeSet.add('C');
        treeSet.add('s');
        System.out.println(treeSet); //natural sorting order
        System.out.println(treeSet.add('Z'));
        System.out.println(treeSet.contains('Z'));
        //treeSet.add(1); heterogeneous elements are not allowed

        //Comparable--> Natural sorting order
        //Comparator--> Customizable sorting order

        //Comparable interface contains only one method which is compareTo(Object obj)
        System.out.println("A".compareTo("B"));
        System.out.println("Z".compareTo("B"));
        System.out.println("C".compareTo("C"));
        System.out.println("Q".compareTo("q"));

        //Comparator interface is used for customized sorting order and is available in java.util package
        //It has two method --> compare(Object obj1,Object obj2) and equals() method

        TreeSet<Integer> treeSet2=new TreeSet<>(new MyComparatorExample());
        treeSet2.add(1);
        treeSet2.add(6);
        treeSet2.add(4);
        treeSet2.add(7);
        treeSet2.add(2);
        System.out.println(treeSet2);

    }
}
