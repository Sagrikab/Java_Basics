package com.problemstatement1.phonebookmanipulation;

import com.problemstatement1.phonebookmanipulation.Contact;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneBook {
    private List<Contact> phoneBook=new ArrayList<>();

    public void setPhoneBook(List<Contact> phoneBook){

        this.phoneBook=phoneBook;
    }

    public List<Contact> getPhoneBook() {
        return phoneBook;
    }

    public void addContact(Contact contactObj){
        phoneBook.add(contactObj);

        }
    public List<Contact> viewAllContacts(){
        return phoneBook;
    }
    public Contact viewContactGivenPhone(String phoneNumber) throws Exception {
        Iterator itr=phoneBook.iterator();
        while (itr.hasNext()){
            Object obj=itr.next();
            Contact c=(Contact) obj;
            String phone=c.getPhoneNumber();

            if(phoneNumber.equals(phone)){
                return c;
            }

        }
        throw new Exception();
    }

    public boolean removeContact(String phoneNumber){
        Iterator itr=phoneBook.iterator();
        while(itr.hasNext()){
            Object obj=itr.next();
            Contact c=(Contact) obj;
            String phone=c.getPhoneNumber();
            if(phoneNumber.equals(phone)){
                itr.remove();
                return true;
            }
        }
        return false;
    }
}
