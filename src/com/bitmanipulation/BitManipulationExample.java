package com.bitmanipulation;

import java.util.Scanner;

public class BitManipulationExample {
    public static void main(String[] args) {
        //Get Bit --> AND operation
        int n=5;
        int pos=2;
        int bitmask=1<<pos;  //1<<2  --> 0001<<2  --> 0100
        if((bitmask &n)==0){ // 0100 & 0101 --> 0100 --> 4
            System.out.println("The bit was zero");
        }
        else{
            System.out.println("The bit was non zero "+(bitmask&n));
        }

        //Set Bit --> OR operation

        int m=5;
        int position=1;
        int bitmasking=1<<position;
        System.out.println(bitmasking|m);

        // Clear Bit --> AND with NOT operation-->First NOT operation and then AND operation

        int p=5;
        int posi=2;
        int bitmaskop=1<<posi;
        int notBitMask=~(bitmaskop);

        int andOperation=notBitMask & p;
        System.out.println(andOperation);

        //Update Bit --> If want to set 1 then set operation--> OR operation, else if want 0 then clear operation--> AND with NOT

        Scanner sc=new Scanner(System.in);
        int operation=sc.nextInt();

        int q=5;
        int positionToUpdate=2;
        int bitMaskingOp=1<<positionToUpdate;
        //if want to set the position to 1
        if(operation==1){

            //set operation --> OR operation
            int newNumber=bitMaskingOp | q;
            System.out.println(newNumber);
        }
        else if(operation==0){

            //clear operation --> AND with NO operation
            int newBitMasking=~(bitMaskingOp);
            int newNumber=newBitMasking & q;
            System.out.println(newNumber);
        }
    }
}
