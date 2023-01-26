package com.problemstatement1.studentmanipulation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentMethod {
    Scanner s=new Scanner(System.in);
    Admission a=new Admission();

    public void add(){
        Student st = new Student();
        System.out.println("Enter the Student Name:");
        st.setName(s.nextLine());

        System.out.println("Enter the Student Roll No:");
        st.setRollNo(s.nextInt());
        s.nextLine();

        System.out.println("Enter the Sub Name:");
        st.setSubName(s.nextLine());

        System.out.println("Enter the Marks: ");
        st.setMarks(s.nextInt());
        s.nextLine();

        a.addData(st);
    }

    public void viewDetails(){
        List<Student> result = a.viewStudentDetails();
        if (result.isEmpty()) {
            System.out.println("The list is empty");

        }
        Iterator iter = result.iterator();
        while (iter.hasNext()) {
            Student student = (Student) iter.next();
            System.out.println("Name: "+student.getName());
            System.out.println("Roll No: "+student.getRollNo());
            System.out.println("Sub Name: "+student.getSubName());
            System.out.println("Marks: "+student.getMarks());
        }
    }
    public void removeStudent(){
        try{
            List<Student> students=a.viewStudentDetails();

            Iterator itr= students.iterator();
            while (itr.hasNext()) {
                Student student = (Student) itr.next();

                if (student.getMarks() < 70) {
                    System.out.println("Student data is removed successfully");
                    a.removeStudent(students);

                }
                else{
                    System.out.println("Student details are not found");
                }
            }
        }catch (Exception e){
            System.out.println("Student details not found");
        }
    }
}
