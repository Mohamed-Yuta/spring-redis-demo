package com.allali.SpringBoot_Redis_Demo.controller;

import com.allali.SpringBoot_Redis_Demo.model.Student;
import com.allali.SpringBoot_Redis_Demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService ;
    @PostMapping("/student")
    public ResponseEntity<String> saveStudent(@RequestBody Student student){
        boolean result =studentService.saveStudent(student);
        if (result){
            return ResponseEntity.ok("Student created successfully");
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
