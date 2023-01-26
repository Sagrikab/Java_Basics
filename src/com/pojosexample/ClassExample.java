package com.pojosexample;

public class ClassExample {
    public static void main(String[] args) {
        Car c=new Car("closed","seated","working",10);
        //In order to not to call the set method the way is we can create custom constructor to not everytime need to assign the values
//        c.setDoors("closed");
//        c.setDriver("seated");
//        c.setEngine("working");
//        c.setSpeed(10);
        System.out.println(c.carFunction());


    }
}
