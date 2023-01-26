package com.problemstatement1.phonebookmanipulation;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.ColorType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChoiceMethods {
    PhoneBook p = new PhoneBook();
    Scanner s = new Scanner(System.in);

    public void addMethod() throws Exception {
        Contact c = new Contact();
        System.out.println("Enter the First Name:");
        c.setFirstName(s.nextLine());

        System.out.println("Enter the Last Name:");
        c.setLastName(s.nextLine());

        System.out.println("Enter the Phone No:");
        c.setPhoneNumber(s.nextLine());
        //s.nextLine();


        System.out.println("Enter the Email ID: ");
        c.setEmailId(s.nextLine());


        p.addContact(c);

    }

    public void displayContacts() {
        List<Contact> result = p.viewAllContacts();
        //System.out.println(result);
        if (result.isEmpty()) {
            System.out.println("The list is empty");
        }
        Iterator iter = result.iterator();
        while (iter.hasNext()) {
            Contact contact = (Contact) iter.next();
            System.out.println(contact);
        }
    }

    public void searchContact() {
        try {
            System.out.println("Enter the phone number to search contact:");
            String searchContact = s.next();
            // s.nextLine();
            System.out.println("The contact is: ");
            Contact contact = p.viewContactGivenPhone(searchContact);
            System.out.println(contact);
        } catch (Exception e) {
            System.out.println("No contact found");
        }
    }

    public void removeContacts() {
        try {
            System.out.println("Enter the phone number to be removed: ");
            String removeNo = s.next();
            System.out.println("Do you want to remove(y/n):");
            String confirm = s.next();
            confirm = confirm.toLowerCase();
            if (confirm.equals("y")) {
                boolean deletedContact = p.removeContact(removeNo);
                //  System.out.println(deletedContact);
                if (deletedContact) {
                    System.out.println("The contact is successfully deleted");
                }
            }
        } catch (Exception e) {
            System.out.println("There is no contact available to delete");
        }

    }

    public boolean avoidDuplicate(){


        return true;
    }
}









