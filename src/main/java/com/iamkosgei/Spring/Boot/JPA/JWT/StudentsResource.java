package com.iamkosgei.Spring.Boot.JPA.JWT;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsResource {
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
    public String students(){
        return "students";
    }
}
