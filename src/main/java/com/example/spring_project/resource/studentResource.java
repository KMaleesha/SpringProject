package com.example.spring_project.resource;

import com.example.spring_project.domain.student;
import com.example.spring_project.exception.notFoundException;
import com.example.spring_project.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

        student Student = StudentService.findStudent(id);
        if(Student == null){
            throw new notFoundException("Invalid Book Id" + id);
        }
        return Student;
    }

    @PostMapping("/students")
    public ResponseEntity<Object> saveStudent(@RequestBody student Student){
        student addedStudent = StudentService.addStudent(Student);

        URI newStudentLocation = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(addedStudent.getStudentId()).toUri();

        return ResponseEntity.created(newStudentLocation).build();

    }
}
