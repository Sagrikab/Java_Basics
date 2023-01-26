package com.collections;

import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Character> llObject=new LinkedList<>();
        llObject.add('A');
        llObject.add('B');
        llObject.add('C');
        llObject.add('D');
        llObject.add('E');
        System.out.println(llObject);

        llObject.remove(3);
        System.out.println(llObject);
        System.out.println("Size of the LL: "+llObject.size());
        llObject.add(3,'R');
        System.out.println(llObject);
        llObject.remove(llObject.indexOf('C'));
        System.out.println(llObject);

        llObject.addFirst('S');
        llObject.addLast('V');
        System.out.println(llObject);

        char c=llObject.removeFirst();
        char d=llObject.removeLast();
        System.out.println(c+" "+d);
        System.out.println(llObject);

    }
}
