package com.problemstatement1.studentmanipulation;

import com.problemstatement1.phonebookmanipulation.ChoiceMethods;
import com.problemstatement1.studentmanipulation.Admission;
import com.problemstatement1.studentmanipulation.Student;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentManipulationMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       // Admission a = new Admission();
      StudentMethod studentMethod=new StudentMethod();
        int i, choice;
        for (i = 0; i < 10; i++) {
            System.out.println("Menu");
            System.out.println("1.Add student details");
            System.out.println("2.Display all student details");
            System.out.println("3.Remove the student if marks is less than 70");
            System.out.println("4.Exit");
            System.out.println("Enter your choice:");
            choice = s.nextInt();
            s.nextLine();
            if (choice == 1) {
               studentMethod.add();
            }
            if (choice == 2) {

            studentMethod.viewDetails();
            }
            if(choice==3){
               studentMethod.removeStudent();
            }
            if(choice==4){
                System.exit(0);
            }
        }
    }
}
