package com.example.springmanagementsystem2;

import com.example.springmanagementsystem2.entity.Student;
import com.example.springmanagementsystem2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringManagementSystem2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringManagementSystem2Application.class, args);
    }

    @Autowired
    private  StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

//        Student student1 = new Student("Daniil", "Aksenov", "daksen@gmail.com");
//        studentRepository.save(student1);
//
//        Student student2 = new Student("Vlad", "Sarakuca", "sarik1@gmail.com");
//        studentRepository.save(student2);
//
//        Student student3 = new Student("Nastya", "Ovnich", "nOvnich@gmail.com");
//        studentRepository.save(student3);
    }
}
