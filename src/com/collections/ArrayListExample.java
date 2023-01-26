package com.collections;

import java.util.ArrayList;
/*
Collections- It comes in java.util package
Collection of data structures like ArrayList,Queues,Stack are known as Collection Framework
Java Collection Framework is a collection of interfaces and classes which makes it easier for storing and processing
collection of objects efficiently.

Advantages
1. No third party API is required
2. No need to create API for handling the collection objects
3. Collection framework is tested and optimized

 */
public class ArrayListExample {
    static ArrayList<String> arlist=new ArrayList<>();
    void removeElementByPosition(int pos){
        arlist.remove(0);
    }
    void removeElementByName(String name){
        arlist.remove(name);
    }
    void displayList(ArrayList<String> names){
        for(String name:names){
            System.out.println(name);
        }
    }
    void modifyName(int pos,String name){
        arlist.set(pos,name);
    }
    int searchElement(String name){
      return  arlist.indexOf(name);
    }
    public static void main(String[] args) {
        arlist.add("Sagarika");
        arlist.add("Sunita");
        arlist.add("Shweta");
        arlist.add("abc");
        arlist.add("pqr");
        System.out.println(arlist.get(1)); //It gives the element at index 1, output will be Sunita
        System.out.println(arlist); // It gives all the elements in the ArrayList
        System.out.println(arlist.getClass().getSimpleName()); // The className it will give as ArrayList

        System.out.println("*******************************");
        ArrayListExample ale=new ArrayListExample();
        ale.displayList(arlist);
        System.out.println("*******************************");
        ale.removeElementByPosition(0);
        ale.displayList(arlist);
        System.out.println("*******************************");
        ale.removeElementByName("abc");
        System.out.println(arlist);
        System.out.println("*******************************");

       int position=ale.searchElement("pqr");
       if(position!=-1){
           ale.modifyName(position,"asdf");
           ale.displayList(arlist);

       }else{
           System.out.println("Invalid Entry");
       }

    }
}
