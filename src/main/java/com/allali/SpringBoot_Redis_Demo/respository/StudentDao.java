package com.allali.SpringBoot_Redis_Demo.respository;

import com.allali.SpringBoot_Redis_Demo.model.Student;

public interface StudentDao {
    boolean saveStudent(Student student);
}
