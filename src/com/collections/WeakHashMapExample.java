package com.collections;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        HashMap hmap=new HashMap();
        Temp t=new Temp();
        hmap.put(t,"Luffy");
        t=null;
        System.gc(); //calling the garbage collector
        Thread.sleep(1000);
        System.out.println(hmap); // the null value will be retained and not deleted
//
        WeakHashMap whmap=new WeakHashMap();
        Temp t2=new Temp();
        whmap.put(t2,"Abc");
        t2=null;
        System.gc();
        System.out.println(whmap); // WeakHashMap is the weak which doesn't hold the null,does not the null object
    }
}
class Temp{

}
