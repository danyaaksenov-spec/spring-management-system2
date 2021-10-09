package com.example.springmanagementsystem2.service;

import com.example.springmanagementsystem2.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudentById(Long id);
}
