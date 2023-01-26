package com.collections;

import java.util.Stack;

public class StackConstructorAndMethods {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push("A");
        s.push('B');
        s.push(1);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.search('B'));
        s.push("C");
        s.push("D");
        System.out.println(s);
        System.out.println(s.search('B'));
        System.out.println(s.search("B"));
        System.out.println(s.empty());

    }
}
