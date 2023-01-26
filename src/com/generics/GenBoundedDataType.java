package com.generics;


class GenericsExampleBounded<T extends Number>{
    T obj;
    GenericsExampleBounded(T obj){
        this.obj=obj;
    }
    void printType(){
        System.out.println(obj.getClass().getName());
    }
}
public class GenBoundedDataType {

    public static void main(String[] args) {
    GenericsExampleBounded<Integer> geb=new GenericsExampleBounded<>(23);
    geb.printType();

    GenericsExampleBounded<Double> geb2=new GenericsExampleBounded<>(54.22);
    geb2.printType();

    //GenericsExampleBounded<String> geb3=new GenericsExampleBounded<String>("ff"); Gives error as there is type bound for numbers
    }
}
