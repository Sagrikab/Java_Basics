package com.problemstatement1.phonebookmanipulation;

import com.problemstatement1.phonebookmanipulation.Contact;
import com.problemstatement1.phonebookmanipulation.PhoneBook;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PhoneBookManipulationMain {
    public static void main(String[] args) throws Exception {

        Scanner s=new Scanner(System.in);
        PhoneBook p=new PhoneBook();
        ChoiceMethods choiceMethods=new ChoiceMethods();
        int i,choice;
        for(i=0;i<10;i++){
            System.out.println("Menu");
            System.out.println("1.Add contact");
            System.out.println("2.Display all contacts");
            System.out.println("3.Search Contact No");
            System.out.println("4.Remove contact");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            choice=s.nextInt();
            s.nextLine();
            if(choice==1){

                //choiceMethods.addMethod();

                choiceMethods.addMethod();

            }
            if(choice==2){
                choiceMethods.displayContacts();
            }
            if(choice==3){
               choiceMethods.searchContact();
            }
            if(choice==4){
               choiceMethods.removeContacts();
            }
            if(choice==5)
                System.exit(0);
            if(choice>5 || choice<1){
                System.out.println("Not a choice!");
                break;
            }
        }
    }
}