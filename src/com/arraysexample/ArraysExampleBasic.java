package com.arraysexample;

public class ArraysExampleBasic {
    public static void main(String[] args) {

        int[] intArrayVariable={1,2,3,4,5,6,7,8,9,10};
        System.out.println(intArrayVariable[9]);

        for(int i=0;i<intArrayVariable.length;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        String[] stringArray={"Sagarika","Sunita"};
        for(String names:stringArray)
            System.out.println(names);
    }
}
