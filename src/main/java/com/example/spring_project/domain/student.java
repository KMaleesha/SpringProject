package com.example.spring_project.domain;

import java.util.Date;

public class student {

    private int studentId;
    private String studentName;
    private Date registeredDate;

    public student(int studentId, String studentName, Date registeredDate){
        this.studentId = studentId;
        this.studentName = studentName;
        this.registeredDate = registeredDate;
    }

    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public Date getRegisteredDate(){
        return registeredDate;
    }
    public void setRegisteredDate(Date registeredDate){
        this.registeredDate = registeredDate;
    }
}
