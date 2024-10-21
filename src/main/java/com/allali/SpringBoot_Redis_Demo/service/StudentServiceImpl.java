package com.allali.SpringBoot_Redis_Demo.service;

import com.allali.SpringBoot_Redis_Demo.model.Student;
import com.allali.SpringBoot_Redis_Demo.respository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;
    @Override
    public boolean saveStudent(Student student) {
        return studentDao.saveStudent(student);
    }
}
