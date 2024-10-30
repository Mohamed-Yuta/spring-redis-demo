package com.allali.SpringBoot_Redis_Demo.service;

import com.allali.SpringBoot_Redis_Demo.model.Student;

import java.util.List;

public interface StudentService {
    boolean saveStudent(Student student);

    List<Student> allStudents();
}
