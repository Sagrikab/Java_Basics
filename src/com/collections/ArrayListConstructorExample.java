package com.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Vector;

public class ArrayListConstructorExample {
    public static void main(String[] args) {
        /*
        * ArrayList is the best choice if our frequent operation is retrieval operation
        (Because ArrayList implements RandomAccess interfaces)
        * ArrayList is the worst choice if our frequent operation is insertion or deletion in the middle
        (Because several shift operations are required)
         */
        ArrayList al=new ArrayList();
        al.add("A");
        al.add(10);
        al.add("A");
        al.add(null);

        System.out.println(al); //al==al.toString()
        al.remove(2);
        System.out.println(al);
        al.add(2,"M");
        al.add("N");
        System.out.println(al);

        ArrayList l1=new ArrayList();
        LinkedList l2=new LinkedList();
        Vector l3=new Vector();

        System.out.println(l1 instanceof Serializable);
        System.out.println(l2 instanceof Cloneable);
        System.out.println(l1 instanceof RandomAccess);
        System.out.println(l2 instanceof RandomAccess);
        System.out.println(l3 instanceof RandomAccess);
    }
}
