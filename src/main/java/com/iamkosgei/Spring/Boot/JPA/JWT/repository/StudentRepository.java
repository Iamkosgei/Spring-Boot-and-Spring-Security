package com.iamkosgei.Spring.Boot.JPA.JWT.repository;

import com.iamkosgei.Spring.Boot.JPA.JWT.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
