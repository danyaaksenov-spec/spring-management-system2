package com.example.springmanagementsystem2.service.impl;

import com.example.springmanagementsystem2.entity.Student;
import com.example.springmanagementsystem2.repository.StudentRepository;
import com.example.springmanagementsystem2.service.StudentService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) { return studentRepository.save(student); }
}
