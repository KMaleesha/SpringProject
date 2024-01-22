package com.example.spring_project.resource;

import com.example.spring_project.domain.student;
import com.example.spring_project.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentResource {

    @Autowired
    private studentService StudentService;

    @GetMapping("/students")
    public List<student> getAllStudents(){
        return StudentService.allStudent();
    }

    @GetMapping("/OneStudent/{id}")
    public Object getOneStudnet(@PathVariable int id){
        return StudentService.findStudent(id);
    }

    @PostMapping("/students")
    public void saveStudent(@RequestBody student Student){
        student addedStudent = StudentService.addStudent(Student);
    }
}
