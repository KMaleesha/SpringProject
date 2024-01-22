package com.example.spring_project.service;

import com.example.spring_project.domain.student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class studentService {
    private static List<student> students = new ArrayList<>();

    static {
        students.add(new student(001, "Maleesha",new Date()));
        students.add(new student(002, "Paramee",new Date()));
        students.add(new student(003, "Sanduni",new Date()));
    }
    public  static int studentCount = 3;

    public List<student> allStudent(){
        return  students;
    }
    public student addStudent(student Student){
        if (Student.getStudentId() == 0){
            Student.setStudentId(studentCount++);
        }
        students.add(Student);
        return Student;
    }

    public student findStudent(int id) {
        for (student Student : students) {
            if (Student.getStudentId() == id) {
                return Student;
            }
        }
        return null;
    }
}
