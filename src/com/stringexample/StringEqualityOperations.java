package com.stringexample;

public class StringEqualityOperations {
    public static void main(String[] args) {
        String s1="ABC";
        String s2="ABC";

//        if(s1==s2){
//            System.out.println("Equal strings");
//        }
//        if(s1.equals(s2)){
//            System.out.println("Strings are equal");
//        }

//        if(s1.compareTo(s2)==0){
//            System.out.println("Strings are equal"); //if part will execute
//        }
//        else{
//            System.out.println("Strings are not equal");
//        }

//        if(new String("PQR")==new String("PQR")){
//            System.out.println("Both the strings are equal");
//        }
//        else{
//            System.out.println("Strings are not equal");  //else part will execute
//        }

        if(new String("ASDF").equals(new String("ASDF"))){
            System.out.println("With equals method the string with different object created but same content are equal");
        }
        else{
            System.out.println("Strings of different object created are not equal");
        }

        String name="My name is Tony Stark";
        String sub=name.substring(11,name.length());
        System.out.println(sub);
    }
}
