package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
Iterator is a universal cursor which is used to traverse through the collection and can also manipulate the collection
ListIterator is applicable only to the List Interface, it has hasNext(),hasPrevious(),next(),previous(),set()- It traverse
from both forward and backward direction.
Enumerator does not have remove() method but works same as Iterator cursor
 */
public class CollectionCursors {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        System.out.println(arrayList);
        Iterator<Integer> iterator=arrayList.iterator(); //Iterator is anonymous class present in the class of an interface
        System.out.println(iterator.getClass().getName());

        while (iterator.hasNext()){
            int i=iterator.next();
            if(i%2!=0){
                System.out.println(i);
            }
            else{
                iterator.remove();
            }
        }
        System.out.println(arrayList);
        System.out.println("*********** ListIterator Example **********");
        LinkedList<Integer> linkedList=new LinkedList<>();
        for(int i=0;i<5;i++){
            linkedList.add(i);
        }
        System.out.println(linkedList);
        ListIterator<Integer> listIterator= linkedList.listIterator();
        while (listIterator.hasNext()){
            int index=listIterator.nextIndex();
            int i=listIterator.next();
            System.out.println("Element at index: "+index+" is "+i);
        }
        System.out.println(listIterator.nextIndex());
        while (listIterator.hasPrevious()){
            int prevIndex=listIterator.previousIndex();
            int p=listIterator.previous();
            System.out.println("Backward traversing of having element at index "+prevIndex+" is "+p);
        }
        System.out.println(listIterator.previousIndex());
        listIterator.set(5);
        System.out.println(linkedList);

    }
}
