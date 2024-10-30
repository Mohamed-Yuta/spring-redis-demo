package com.allali.SpringBoot_Redis_Demo.respository;

import com.allali.SpringBoot_Redis_Demo.model.Student;

import java.util.List;

public interface StudentDao {
    boolean saveStudent(Student student);

    List<Student> allStudents();
}
