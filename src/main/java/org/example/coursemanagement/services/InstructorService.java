package org.example.coursemanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {

    private final com.example.coursemanagement.repositories.InstructorRepository repository;

    @Autowired
    public InstructorService(com.example.coursemanagement.repositories.InstructorRepository repository) {
        this.repository = repository;
    }

    public List<com.example.coursemanagement.models.Instructor> getAllInstructor() {
        return repository.findAll();
    }
}