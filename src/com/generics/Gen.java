package com.generics;


/*
With generics, we can define an algorithm ones, independently of any specific type of data, and then apply
that wide variety of data types without any additional effort.
It means parameterized types(it enables to create classes, interfaces and methods in which "type of data" upon which
they operate is specified as parameter"
A class,interface or method that operates on parameterized types is called generics,as in generic class or generic method
 */

class NonGen{
    Object ob;
    NonGen(Object o){
        ob=o;
    }
    Object getOb(){
        return ob;
    }
        }

        class Gener<T>{ //parameter Type of any data type(Generics)
           T ob;
            Gener(T o){
                ob=o;
            }
            T getOb(){
                return ob;
            }

        }
public class Gen {
    public static void main(String[] args) {

        NonGen iob=new NonGen(88);
        int v=(Integer)iob.getOb();
        System.out.println(v);

        NonGen strOb=new NonGen("Non Generics Test");
        String str=(String)strOb.getOb();
        System.out.println(str);

//        iob=strOb; //syntactically right, semantically wrong
//        v=(Integer)iob.getOb();
//        System.out.println(v);

        Gener<Integer> gen=new Gener<>(88);
        int val=gen.getOb(); // Autoboxing--> Converting primitive data type to Wrapper class(int to Integer)
        System.out.println(val); //Again converting from Wrapper class to primitive type(Integer to int)
       // System.out.println("abc");

        Gener<String> gener=new Gener<>("Generics");
        String ans=gener.getOb();
        System.out.println(ans);

        //val=ans; This line will give compile time error as it is not semantically right and generics will show it
    }
}
