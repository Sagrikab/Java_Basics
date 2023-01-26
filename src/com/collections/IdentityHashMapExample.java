package com.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        IdentityHashMap id=new IdentityHashMap();
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        /*
        In IdentityHashMap (==) is used to check the reference of the two Objects
        as here both are different objects so the value will not be override and both the values will be printed
         */
        id.put(i1,"ABC");
        id.put(i2,"PQR");
        System.out.println(id);

        /*
        In HashMap (.equals()) method will be used so if the contents are equal the second value will
        override the first value
         */

        HashMap hmap=new HashMap();
        hmap.put(i1,"ASD");
        hmap.put(i2,"JKL");
        System.out.println(hmap);
    }
}
