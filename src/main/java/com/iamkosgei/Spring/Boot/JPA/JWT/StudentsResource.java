package com.iamkosgei.Spring.Boot.JPA.JWT;

import com.iamkosgei.Spring.Boot.JPA.JWT.models.Student;
import com.iamkosgei.Spring.Boot.JPA.JWT.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentsResource {
    @Autowired
    StudentService studentService;
    //no security
    @GetMapping("/")
    public String home(){
        return ("<h1> Welcome </h1>");
    }
    //admin and users
    @GetMapping("/user")
    public String user(){
        return "user";
    }
    //only admin
    @GetMapping("/students")
    public List<Student> students(){
        return studentService.getStudents();
    }
}
