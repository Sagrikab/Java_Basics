package com.problemstatement1.studentmanipulation;

import java.util.ArrayList;
import java.util.List;

public class Admission {

    List<Student> list=new ArrayList<>();

    public void addData(Student stuObj){
        list.add(stuObj);
    }

    public List<Student> viewStudentDetails(){
        return list;
    }
    public void removeStudent(List<Student> student){
        for(Student studentDetails:student){
            if(studentDetails.getMarks()<70){
                student.remove(studentDetails);
                System.out.println(student);
            }
        }
    }

}
