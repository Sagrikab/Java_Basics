package com.problemstatement1.phonebookmanipulation;

public class Contact {

private String firstName;
private String lastName;
private String phoneNumber;
private String emailId;

    public String getFirstName() {
        return firstName;
    }
//    PhoneBook phoneBook=new PhoneBook();
//    ChoiceMethods choiceMethods=new ChoiceMethods();
    public void setFirstName(String firstName) {
        if(firstName.length()>4 && firstName.matches("[a-zA-Z]+"))
        this.firstName = firstName;
        else {
            System.out.println("First name should be greater than length 4 or check the correct format!!");
            System.exit(0);
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.matches("^\\d{10}$"))
        this.phoneNumber = phoneNumber;

        else{
            System.out.println("Incorrect format for the Phone Number, Should be 10 digits");
            System.exit(0);
        }
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        if(emailId.matches("^(.+)@[a-z+](.+)[a-z]$"))
        this.emailId = emailId;
        else {
            System.out.println("Incorrect format of the Email!!");
            System.exit(0);
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length()>4 && lastName.matches("[a-zA-Z]+"))
        this.lastName = lastName;
        else {
            System.out.println("The length of the lastname should be of length greater than 4 or check the correct format");
            System.exit(0);
        }
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public Contact(String firstName, String lastName, String phoneNumber, String emailId){
    this.firstName=firstName;
    this.lastName=lastName;
    this.phoneNumber=phoneNumber;
    this.emailId=emailId;
    }
    public Contact(){

    }

}
