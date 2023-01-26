package com.inheritanceexample;

import com.inheritanceexample.vehicles.Bike;

public class Demo {
    public static void main(String[] args) {

        Bike bike=new Bike();
        bike.engine="Petrol";

        System.out.println(bike.lights); //if light variable is declared as private then it will produce error
    }
}

