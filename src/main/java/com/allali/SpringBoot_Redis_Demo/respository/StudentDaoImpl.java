package com.allali.SpringBoot_Redis_Demo.respository;

import com.allali.SpringBoot_Redis_Demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private RedisTemplate redisTemplate;
    private static final String KEY="STUDENT";
    @Override
    public boolean saveStudent(Student student) {
        try {
            redisTemplate.opsForHash().put(KEY,student.getId().toString(),student);
            return true;
        }
        catch (Exception e){
            e.printStackTrace();;
            return false;
        }
    }
}
