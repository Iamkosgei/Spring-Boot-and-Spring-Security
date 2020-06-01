package com.iamkosgei.Spring.Boot.JPA.JWT.services;

import com.iamkosgei.Spring.Boot.JPA.JWT.models.Student;
import com.iamkosgei.Spring.Boot.JPA.JWT.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();

    }
}
