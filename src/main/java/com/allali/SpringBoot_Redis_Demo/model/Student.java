package com.allali.SpringBoot_Redis_Demo.model;
import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
