package javabasics.com;

import java.util.*;
public class Palindrome_Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int temp=x;

        int rem,ans=0;
        while(x>0){
            rem=x%10;
            ans=(ans*10)+rem;
            x=x/10;
        }
        if(ans==temp)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

    }
}
