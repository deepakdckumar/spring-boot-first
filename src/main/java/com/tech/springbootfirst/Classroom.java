package com.tech.springbootfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@RestController
public class Classroom {
    @Autowired
    private Student student;
    
    @GetMapping("/students")
    public List<Student> getStudents() {
        return Arrays.asList(new Student(1, "Deepak", "Java"), new Student(2, "Sudhanshu", "Selenium"));
    }
}
