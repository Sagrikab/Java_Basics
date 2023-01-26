package com.collections;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/*
Set Interface does not have it's own method it uses the methods of the parent Collection interface
HashSet is the implementation class of Set Interface, its underlying data structure is hash table
- Duplicates are not allowed
- Insertion order is also not preserved

LinkedHashSet is also the implementation class and child class of HashSet class, it's underlying data structure is
Hash Table+Linked List
- Duplicates are not allowed
- Insertion order is preserved
 */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Pune");
        hashSet.add("Mumbai");
        hashSet.add("Bangalore");
        hashSet.add("Assam");
        System.out.println(hashSet); //Insertion order is not preserved
        System.out.println(hashSet.contains("Pune"));
        hashSet.clear();
        System.out.println(hashSet.isEmpty());

        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Pune");
        linkedHashSet.add("Mumbai");
        linkedHashSet.add("Bangalore");
        linkedHashSet.add("Assam");
        System.out.println(linkedHashSet);
    }
}
