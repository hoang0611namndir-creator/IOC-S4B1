package org.example.coursemanagement.services;

import org.example.coursemanagement.models.Student;
import org.example.coursemanagement.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository){
        this.repository=repository;
    }

    public List<Student> getAllStudents(){
        return repository.findAll();
    }
}