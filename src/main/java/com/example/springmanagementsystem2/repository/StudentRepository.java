package com.example.springmanagementsystem2.repository;

import com.example.springmanagementsystem2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
